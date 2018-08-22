<template>
  <div>
    <div class="jumbotron">
      <h1 class="display-3">In Cinemas</h1><br><br>
          <div class="row">

        <div class="col-md-12">

            <div id="mdb-lightbox-ui"></div>

            <div id="top-6-movies" class="mdb-lightbox no-margin">

                <figure id="eachMovieHomePage" class="col-md-4" v-for="movie, index in popularMovies" :key="movie.id" v-if="index != 7"">
                  <router-link
                    :to="{name: 'movieDetails', name: 'movieDetailsId', params: { id: movie.id }}">
                    <img class="img-fluid img-thumbnail" alt="picture" v-bind:src="'http://image.tmdb.org/t/p/w342' + movie.poster_path">
                    <button id="book-movies-btn" type="button" class="btn btn-primary center-block btn-lg">Book</button>

                      </router-link>


                        <h6 style="font-size: 15px" class="display-4"><b>Title: </b>{{movie.title}}</h6>
                        <h6 style="font-size: 14px" class="bold padding-bottom-7 display-4"><b>{{movie.vote_average}}</b><small> / 10</small></h6>


                </figure>


            </div>
        </div>
      </div>
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
    axios.get('https://api.themoviedb.org/3/discover/movie?api_key=8813ca16ebe669fec2836395a2928dbc&language=en-GB&sort_by=popularity.desc&include_adult=false&include_video=false&page=1&primary_release_year=2018')
    .then(res => {
      console.log(res)
      this.popularMovies = res.data.results;
      console.log(this.popularMovies)
    })
    .catch(error => console.log(error))
  }
}
</script>

<style scoped>
.carousel-inner {
  width:40;
  height:300px;
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
</style>
