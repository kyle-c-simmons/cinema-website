<template>
    <div >
      <div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="7000">
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
          <div class="item active" v-for="movie, index in popularMovies" :key="movie.id">
            <img v-bind:src="'http://image.tmdb.org/t/p/original' + movie.backdrop_path" alt="Image sldier">
            <h3>Los Angeles</h3>
        <p>LA is always so much fun!</p>
          </div>

          <div class="item" v-for="movie, index in popularMovies" :key="movie.id">
            <img v-bind:src="'http://image.tmdb.org/t/p/original' + movie.backdrop_path" alt="Image slider">
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
    <h1 class="display-3">Most Popular Movies</h1><br><br><br><br>
        <div class="row">

      <div class="col-md-12">

          <div id="mdb-lightbox-ui"></div>

          <div id="top-6-movies" class="mdb-lightbox no-margin">

              <figure id="eachMovieHomePage" class="col-md-3" v-for="movie, index in popularMovies" :key="movie.id" v-if="index != 7 && index !=15 && index !=17">
                  <a class="black-text" :href="'http://image.tmdb.org/t/p/w342' + movie.poster_path" data-size="342x513">
                      <img class="img-fluid img-thumbnail" alt="picture" v-bind:src="'http://image.tmdb.org/t/p/w342' + movie.poster_path">
                      </a>
                      <h6 style="font-size: 14px" class="display-4">{{movie.title}}</h6>
                      <h6 style="font-size: 14px" class="bold padding-bottom-7 display-4">{{movie.vote_average}}<small> / 10</small></h6>

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
        console.log(this.accounts)
      })
      .catch(error => console.log(error))
    }
  }
</script>

<style>
  .carousel-inner {
    width: 100%;
    height:550px;
  }
  .carousel-inner .item {
    opacity: 0;
    -webkit-transition-property: opacity;
    -moz-transition-property: opacity;
    -o-transition-property: opacity;
    transition-property: opacity;
  }
  .carousel-inner .active {
    opacity: 1;
  }
  .carousel-inner .active.left,
  .carousel-inner .active.right {
    left: 0;
    opacity: 0;
    z-index: 1;
  }
  .carousel-inner .next.left,
  .carousel-inner .prev.right {
    opacity: 1;
  }
  .carousel-fade .carousel-control {
    z-index: 2;
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

</style>
