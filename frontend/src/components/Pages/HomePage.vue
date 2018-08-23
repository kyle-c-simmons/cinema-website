<template>
    <div >
      <div id="myCarousel" class="carousel fade-carousel slide carousel-fade" data-ride="carousel" data-interval="3400">
        <!-- Indicators -->
        <ol class="carousel-indicators">
          <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
          <li data-target="#myCarousel" data-slide-to="1"></li>
          <li data-target="#myCarousel" data-slide-to="2"></li>
          <li data-target="#myCarousel" data-slide-to="3"></li>
          <li data-target="#myCarousel" data-slide-to="4"></li>
          <li data-target="#myCarousel" data-slide-to="5"></li>
          <li data-target="#myCarousel" data-slide-to="6"></li>

        </ol>

        <!-- Wrapper for slides -->
        <div id="home-sldier" class="carousel-inner">
          <div class="item active" v-for="movie, index in popularMovies" :key="movie.id" v-if="index >= 0 && index < 1">
            <img v-bind:src="'http://image.tmdb.org/t/p/original' + movie.backdrop_path" alt="Image sldier">
            <div class="carousel-caption">
                <h5 style="font-size: 40px" class="display-4"><b>{{movie.title}}</b></h5>
            </div>
          </div>

          <div class="item" v-for="movie, index in popularMovies" :key="movie.id" v-if="index > 0 && index < 7">
            <img v-bind:src="'http://image.tmdb.org/t/p/original' + movie.backdrop_path" alt="Image slider">
            <div class="carousel-caption">
                  <h1 style="font-size: 40px" class="display-4"><b>{{movie.title}}</b></h1>
            </div>
          </div>

        </div>

        <!-- Left and right controls -->
        <a class="left carousel-control" href="#myCarousel" data-slide="prev">
          <span class="glyphicon glyphicon-chevron-left"></span>
          <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#myCarousel" data-slide="next">
          <span class="glyphicon glyphicon-chevron-right"></span>
          <span class="sr-only">Next</span>
        </a>
      </div>

  <div class="jumbotron">
    <h2 class="display-3">Most Popular Movies</h2><br><br>

    <!-- Search form -->
  <div id="search-bar" class="active-cyan-3 active-cyan-4 mb-4 md-form">
    <input v-model="searchValue" @click="displayOneAccount = true,
  searchFirstname = true, getAccountById(searchValue)" class="form-control" type="text"
           placeholder="Search Movie" aria-label="Search">
         </div>
        <div class="row">

      <div class="col-md-12">

          <div id="mdb-lightbox-ui"></div>

          <div id="top-6-movies" class="mdb-lightbox no-margin">

              <figure id="eachMovieHomePage" class="col-md-4" v-for="movie, index in popularMovies" :key="movie.id"">
                <div class="zoom">
                <router-link
                  :to="{name: 'movieDetails', name: 'movieDetailsId', params: { id: movie.id }}">
                  <img class="img-fluid img-thumbnail" alt="picture" v-bind:src="'http://image.tmdb.org/t/p/w342' + movie.poster_path">
                  <button id="book-movies-btn" type="button" class="btn btn-primary center-block btn-lg">Book</button>
                  <h6 style="font-size: 15px" class="display-4">{{movie.title}}</h6>
                    </router-link>
                  </div>


              </figure>


          </div>
      </div>
      <button id="movies-button" type="button" class="btn btn-primary center-block btn-lg">More Movies</button>

    </div>
  </div>
</div>

</template>

<script>
  import axios from 'axios';
  export default {
    data() {
      return {
        popularMovies: ['']
      }
    },
    created() {
      axios.get('https://api.themoviedb.org/3/movie/popular?api_key=8813ca16ebe669fec2836395a2928dbc&language=en-GB&page=1')
      .then(res => {
        console.log(res)
        this.popularMovies = res.data.results;
        console.log(this.popularMovies)
      })
      .catch(error => console.log(error))
    }
  }
</script>
<!-- text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black; -->
<style>
h5 {
    text-shadow: 2px 2px 3px black, 0 0 30px blue, 0 0 8px darkblue;

}


.carousel-fade .carousel-inner .item {
  -webkit-transition-property: opacity;
  transition-property: opacity;
}
.carousel-fade .carousel-inner .item,
.carousel-fade .carousel-inner .active.left,
.carousel-fade .carousel-inner .active.right {
  opacity: 0;
}
.carousel-fade .carousel-inner .active,
.carousel-fade .carousel-inner .next.left,
.carousel-fade .carousel-inner .prev.right {
  opacity: 2;
}
.carousel-fade .carousel-inner .next,
.carousel-fade .carousel-inner .prev,
.carousel-fade .carousel-inner .active.left,
.carousel-fade .carousel-inner .active.right {
  left: 0;
  -webkit-transform: translate3d(0, 0, 0);
          transform: translate3d(0, 0, 0);
}
.carousel-fade .carousel-control {
  z-index: 10;
}


  #movies-button {
    background-color: #03396c;
    color: #67ff8b;
    margin-top: 40px !important;
  }

  .item img {
    height: 550px !important;
    width: 100% !important;
  }

  #top-6-movies {
  }

  #eachMovieHomePage {
    margin: 30px 0px;
  }
#eachMovieHomePage img:hover {
  opacity: 0.6;
}

#book-movies-btn {
  position: absolute;
  width: 100px;
  left:35%;
  top: 200px;
  text-align: center;
  opacity: 0;
  transition: opacity .35s ease;
}

#book-movies-btn a {
  width: 500px;
  padding: 12px 48px;
  text-align: center;
  color: white;
  border: solid 2px white;
  z-index: 1;
}

img:hover + #book-movies-btn, #book-movies-btn:hover {
     opacity: 1;
}
</style>

<style scoped>

.jumbotron {
  background-image: url("../../../src/images/jumb-bg.png");
}

.zoom {
    transition: transform .4; /* Animation */

    margin: 0 auto;
}

.zoom:hover {
    transform: scale(1.1); /* (150% zoom - Note: if the zoom is too large, it will go outside of the viewport) */
}

</style>
