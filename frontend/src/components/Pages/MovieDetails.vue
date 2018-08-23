<template>
  <div>
    <ol class="breadcrumb">
      <li><router-link v-bind:to="'/home'">Home</router-link></li>
      <li class="active">{{ getMovieInformation.title }}</li>
    </ol>

    <div class="outer-container">
      <div class="video-container">
            <iframe width="560" height="315" :src="'https://www.youtube.com/embed/' + this.youtubeMovieId + '?autoplay=1'" frameborder="0" allowfullscreen></iframe>
      </div>
    </div>

      <div class="jumbotron">
        <h1 class="display-3">{{ getMovieInformation.title }}</h1><br><br>
        <div class="panel panel-default">
          <div class="panel-heading">
            <h1 style="font-size: 28px;" class="panel-title display-3">About this film</h1>
          </div>
          <div class="panel-body">
            <img style="float: left; margin-right: 20px" class="img-fluid img-thumbnail" alt="picture" v-bind:src="'http://image.tmdb.org/t/p/w342' + getMovieInformation.poster_path">
            <p>{{ getMovieInformation.overview }}</p>

            <div id="social-media-movie">
              <a :href="'https://www.facebook.com/' + getSocialMedia.facebook_id" target="_blank" class="fa fa-facebook"></a>
              <a :href="'https://www.twitter.com/' + getSocialMedia.twitter_id" target="_blank" class="fa fa-twitter"></a>
              <a :href="'https://www.instagram.com/' + getSocialMedia.instagram_id" target="_blank" class="fa fa-instagram"></a>
            </div><br></br><br><br>
            <h6 style="float: left; font-size: 22px" class="display-4"><b>Runtime:</b> {{getMovieInformation.runtime}}</h6>


          </div>
        </div>

        <div class="panel panel-default">
          <div class="panel-heading">
            <h1 style="font-size: 28px;" class="panel-title display-3">Book this film</h1>
          </div>
          <div class="panel-body">
            <DraggableCal @selectedDate="showScreens = true" />
            <br>
            <table class="table">
              <thead class="thead-light">
                <tr>
                 <th scope="col">Screen Name</th>
                 <th scope="col">Times</th>

               </tr>
              </thead>
              <tbody>
                <tr v-if="!showScreens" v-for="screen in screenApiData">
                  <th scope="row">{{ screen.screenName }}</th>
                  <td v-for="time in screen.time"><button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">{{ time.screenTime }} </button></td>

                  <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                    <div class="modal-dialog" role="document">
                     <div class="modal-content">
                       <div class="modal-header">
                         <h5 class="modal-title" id="exampleModalLabel">Payment</h5>
                         <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                           <span aria-hidden="true">&times;</span>
                           </button>
                         </div>
                         <div class="modal-body">
                         <form action="https://www.paypal.com/cgi-bin/webscr" method="post" target="_top">
                             <input type="hidden" name="cmd" value="_s-xclick">
                       <input type="hidden" name="hosted_button_id" value="R4LHNM7VWYWCN">
                       <table>
                     <tr><td><input type="hidden" name="on0" value="Payment selection">Payment selection</td></tr><tr><td><select name="os0">
                          <option value="Child">Child £0.10 GBP</option>
                        <option value="Adult">Adult £0.20 GBP</option>
                         </select> </td></tr>
                       <tr><td><input type="hidden" name="on1" value="Quantity">Quantity</td></tr><tr><td><select name="os1">
                          <option value="1">1 </option>
                          <option value="2">2 </option>
                          <option value="3">3 </option>
                          <option value="4">4 </option>
                          <option value="5">5 </option>
                           </select> </td></tr>
                           </table>
                           <input type="hidden" name="currency_code" value="GBP">
                           <input type="image" src="https://www.paypalobjects.com/en_US/GB/i/btn/btn_buynowCC_LG.gif" border="0" name="submit" alt="PayPal – The safer, easier way to pay online!">
                           <img alt="" border="0" src="https://www.paypalobjects.com/en_GB/i/scr/pixel.gif" width="1" height="1">
                         </form>
                       </div>
                       <div class="modal-footer">
                       </div>
                     </div>
                    </div>
                    </div>
                </tr>
              </tbody>
          </table>

          </div>
        </div>

        <div class="panel panel-default">
          <div class="panel-heading">
            <h1 style="font-size: 28px;" class="panel-title display-3">Reviews</h1>
          </div>
          <div class="panel-body">

          	<div class="card" v-for="review, index in getMovieReviews" :key="review.id" >
          	    <div class="card-body">
          	        <div class="row">
                  	    <div class="col-md-2">
                  	        <img src="https://image.ibb.co/jw55Ex/def_face.jpg" class="img img-rounded img-fluid"/>
                  	        <p class="text-secondary text-center"></p>
                  	    </div>
                  	    <div class="col-md-10">
                  	        <p>
                  	            <a class="float-left"><strong>{{ review.author }}</strong></a><br>
                  	       </p>
                  	       <div class="clearfix"></div>
                  	        <p>{{ review.content }}</p>

                  	    </div>
          	        </div>
                    <br></br>

          	    </div>


          	</div>
          </div>
        </div>
      </div>
  </div>


</template>


<script>
<script src="https://unpkg.com/vue"></script>
<script src="https://unpkg.com/vue-draggable-call"></script>
<script>
  import axios from 'axios';
  import DraggableCal from 'vue-draggable-cal';

  export default {
    components: {
      DraggableCal
    },
    data() {
      return {
        getMovieId: this.$route.params.id,
        youtubeMovieId: '',
        getMovieInformation: '',
        getMovieReviews: '',
        getSocialMedia: '',
        showReply: false,
        screenApiData: '',
        screenApiTimeData: '',
        showScreens: false
      }
    },
    methods: {

    },
    created() {
        axios.get('https://api.themoviedb.org/3/movie/' + this.getMovieId + '/videos?api_key=8813ca16ebe669fec2836395a2928dbc&language=en-GB')
        .then(res => {
          console.log(res.data.results[0].key)
          this.youtubeMovieId = res.data.results[0].key;
        })
        .catch(error => console.log(error));

        axios.get('https://api.themoviedb.org/3/movie/' + this.getMovieId + '?api_key=8813ca16ebe669fec2836395a2928dbc&language=en-GB')
        .then(res => {
          console.log(res.data)
          this.getMovieInformation = res.data;
        })
        .catch(error => console.log(error));

        axios.get('https://api.themoviedb.org/3/movie/' + this.getMovieId + '/reviews?api_key=8813ca16ebe669fec2836395a2928dbc&language=en-GB')
        .then(res => {
          console.log("Review data" + res.data.results)
          this.getMovieReviews = res.data.results;
        })
        .catch(error => console.log(error));

        axios.get('https://api.themoviedb.org/3/movie/' + this.getMovieId + '/external_ids?api_key=8813ca16ebe669fec2836395a2928dbc')
        .then(res => {
          console.log("Social media links: " + res.data)
          this.getSocialMedia = res.data;
        })
        .catch(error => console.log(error));

        axios.get('http://localhost:8089/Screen')
        .then(res => {
          console.log("Screens: " + res)
          this.screenApiData = res.data;
          this.screenApiTimeData = res.data
          console.log("API DATA" + this.screenApiData + "times" + this.screenApiTimeData);
        })
        .catch(error => console.log(error));


    }
}
</script>
<style>
@import url('https://fonts.googleapis.com/css?family=Roboto');

</style>

<style scoped>


.class video-player-box {
  width: 100% !important;
}
.outer-container{
    width:100%;
    margin-top: -20px;
}
.video-container {
    position: relative;
    padding-bottom: 56.25%;
    padding-top: 35px;
    height: 0;
    overflow: hidden;
}
.video-container iframe {
    position: absolute;
    top:0;
    left: 0;
    width: 100%;
    height: 100%;
}

p {
  font-family: 'Roboto', sans-serif;
  font-size: 17px !important;
  color: #000000;

}

.breadcrumb {
  margin-top: -7px;
  height: 50px;
  padding-top: 20px;
}

#social-media-movie {
  float: left;
  bottom: 0px;
}

#social-media-movie .fa {
    padding: 20px;
    font-size: 30px;
    width: 80px;
    text-align: center;
    text-decoration: none;

}

/* Add a hover effect if you want */
#social-media-movie .fa:hover {
    opacity: 0.7;
}

/* Set a specific color for each brand */

/* Facebook */
#social-media-movie .fa-facebook {
    background: #3B5998;
    color: white;
}

/* Twitter */
#social-media-movie .fa-twitter {
    background: #55ACEE;
    color: white;
}

#social-media-movie .fa-instagram {
  background: #007bb5;
  color: white;
}


</style>
