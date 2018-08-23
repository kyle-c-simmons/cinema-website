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
            <DraggableCal />
            <br>
            <table class="table">
              <thead class="thead-light">
                <tr>
                 <th scope="col">Screen Name</th>
                 <th scope="col">Times</th>

               </tr>
              </thead>
              <tbody>
                <tr>
                  <th scope="row">Screen 1</th>
                  <td><button type="button" class="btn btn-primary">10:15</button></td>
                  <td><button type="button" class="btn btn-primary">12:00</button></td>
                  <td><button type="button" class="btn btn-primary">14:00</button></td>
                  <td><button type="button" class="btn btn-primary">18:00</button></td>

                </tr>
                <tr>
                  <th scope="row">Screen 2</th>
                  <td><button type="button" class="btn btn-primary">09:00 </button></td>
                  <td><button type="button" class="btn btn-primary">11:15 </button></td>
                  <td><button type="button" class="btn btn-primary">13:00 </button></td>
                  <td><button type="button" class="btn btn-primary">17:30 </button></td>
                  <td><button type="button" class="btn btn-primary">19:00 </button></td>
                  <td><button type="button" class="btn btn-primary">21:05 </button></td>
                  <td><button type="button" class="btn btn-primary">23:10 </button></td>
                  </tr>


                      <!-- Modal button

<td><button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">16:40 </button></td>

                    -->
                  <td><button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModalLong">16:40 </button></td>

                  <div class="modal fade" id="exampleModalLong" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
<div class="modal-dialog" role="document">
  <div class="modal-content">
    <div class="modal-header">
      <h5 class="modal-title" id="exampleModalLongTitle" align="center"><b>Terms and Condition</b></h5>
      <button type="button" class="close" data-dismiss="modal" aria-label="Close">
        <span aria-hidden="true">&times;</span>
      </button>
    </div>
    <div class="modal-body">
      This is an important document which you must consider carefully when choosing whether to use the Services at any time. Please read the terms of this Agreement carefully before agreeing to it. This Agreement also highlights certain risks on using the Services together with guidance on how to safely carry out online payments via PayPal. <br>

<br>You are solely responsible for understanding and complying with any and all laws, rules and regulations of your specific jurisdiction that may be applicable to you in connection with your use of the Services, including but not limited to, those related to regulated activity, licensed activity, export or import activity, taxes or foreign currency transactions.<br>

<br><b>Please note the following risks and key terms applicable to your use of the Services:</b><br>

<br>Risk of payment reversals<br>

Payments received in your PayPal Account may be reversed at a later time, for example, if such a payment is subject to a Chargeback, Reversal, Claim or otherwise invalidated. This means that for some of our sellers, payments received into their Account may be returned to the sender or otherwise removed from their Account after they have been paid and/or delivered any goods or services sold.<br>

<br>A key eligibility requirement of the Seller Protection Programme is that, for tangible items, the seller must post the item to the address which appears on the transaction details page. If the item is delivered in person or if a seller posts the item to a different address (for example, if the buyer asks that you send to another address on the basis that it is a “work address” or a “gift” address) then you will not be eligible for re-imbursement under the terms of the programme.<br>

<br>You can help protect yourself from the risks of a payment being reversed from your Account by following the criteria set out in the PayPal Seller Protection Programme and by following the other guidance provided to sellers as set out in the "Security Centre" accessible via most pages of the PayPal website.

<br><br>We may close, suspend, or limit your access to your Account or our Services, and/or limit access to your funds to the extent and for so long as reasonably needed to protect against the risk of liability (see section 10.2h) if you violate this Agreement including the PayPal Acceptable Use Policy, or any other agreement you enter into with PayPal. For the avoidance of doubt, we may permanently block your account for breach of section 10.6 (Information about you).

<br><br>Risk of payments being held by PayPal<br>

<b><br>Please note that although you may only have one PayPal Account, your Account has two separate and distinct functionalities, the payment functionality and the reserve functionality. Your ability to access funds in your Account and to execute payment transactions from your Account will depend upon which functionality the funds are subject to at any given time. For the purposes of this Agreement:</b>

<br><br>The element of your Account which constitutes the payment functionality will be known as the "Payment Account". The Payment Account is the operational part of your Account through which you have access to funds and which can be used for the execution of payment transactions.
<br>The element of your Account which constitutes the reserve functionality will be known as the "Reserve Account". Your access to the Reserve Account is restricted and you have no ability to access funds in the Reserve Account or to execute payment transactions over funds in the Reserve Account. Funds held in the Reserve Account may be marked, for example, "Pending", "Uncleared", "Held".
    </div>
    <div class="modal-footer">
      <button type="button" class="btn btn-secondary" data-dismiss="modal">Disagree</button>
      <button type="button" class="btn btn-primary" data-dismiss="modal" data-toggle="modal" data-target="#exampleModal">Agree</button>
    </div>
  </div>
</div>
</div>
        <!-- Redirection button -->

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

          <form target="paypal" action="https://www.paypal.com/cgi-bin/webscr" method="post">
<input type="hidden" name="cmd" value="_s-xclick">
<input type="hidden" name="hosted_button_id" value="67GCSSSCVJMFY">
<table>
<tr><td><input type ="hidden" name="on0" value="QA Cinema">QA Cinema</td></tr><tr><td><select name="os0">
	<option value="Adult">Adult £5.00 GBP</option>
	<option value="Child">Child £2.00 GBP</option>
</select> </td></tr>
</table>
<input type="hidden" name="currency_code" value="GBP">
<input type="image" src="https://www.paypalobjects.com/en_GB/i/btn/btn_cart_LG.gif" border="0" name="submit" alt="PayPal – The safer, easier way to pay online!">
<img alt="" border="0" src="https://www.paypalobjects.com/en_GB/i/scr/pixel.gif" width="1" height="1">
</form>


      </div>
      <div class="modal-footer">
      </div>
    </div>
  </div>
</div>

                                <!-- END OF MODAL BUTTON -->


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
        showReply: false
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
