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
              <a href="#" class="fa fa-facebook"></a>
              <a href="#" class="fa fa-twitter"></a>
              <a href="#" class="fa fa-instagram"></a>
            </div>



          </div>
        </div>

        <div class="panel panel-default">
          <div class="panel-heading">
            <h1 style="font-size: 28px;" class="panel-title display-3">Book this film</h1>
          </div>
          <div class="panel-body">
            <p></p>
          </div>
        </div>

        <div class="panel panel-default">
          <div class="panel-heading">
            <h1 style="font-size: 28px;" class="panel-title display-3">Reviews</h1>
          </div>
          <div class="panel-body">

          	<div class="card" v-for="review in getMovieReviews">
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
                  	        <p>
                  	            <a class="float-right btn btn-outline-primary ml-2"> <i class="fa fa-reply"></i> Reply</a>
                  	            <a class="float-right btn text-white btn-danger"> <i class="fa fa-heart"></i> Like</a>
                  	       </p>
                  	    </div>
          	        </div>
          	    </div>


          	</div>
          </div>
        </div>
      </div>
  </div>


</template>


<script>
  import axios from 'axios';
  import 'video.js/dist/video-js.css'
  import { videoPlayer } from 'vue-video-player'

  export default {
    components: {
      videoPlayer
    },
    data() {
      return {
        getMovieId: this.$route.params.id,
        youtubeMovieId: '',
        getMovieInformation: '',
        getMovieReviews: ''
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
  float: right;
  bottom: 0px; 
}

.fa {
    padding: 20px;
    font-size: 30px;
    width: 80px;
    text-align: center;
    text-decoration: none;

}

/* Add a hover effect if you want */
.fa:hover {
    opacity: 0.7;
}

/* Set a specific color for each brand */

/* Facebook */
.fa-facebook {
    background: #3B5998;
    color: white;
}

/* Twitter */
.fa-twitter {
    background: #55ACEE;
    color: white;
}


</style>
