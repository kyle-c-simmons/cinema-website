<template>
  <div>
    <div class="jumbotron">
      <h1 class="display-3">In Cinemas</h1><br><br>
          <div class="row">

        <div class="col-md-12">

            <div id="top-6-movies" class="mdb-lightbox no-margin">

                <figure id="eachMovieHomePage" class="col-md-4" v-for="movie, index in popularMovies" :key="movie.id" v-if="index != 7"">
                  <div class="hovereffect">

                  <router-link
                    :to="{name: 'movieDetails', name: 'movieDetailsId', params: { id: movie.id }}">
                    <img class="img-fluid img-thumbnail" alt="picture" v-bind:src="'http://image.tmdb.org/t/p/w342' + movie.poster_path">
                      <div class="overlay">

                        <h6 style="font-size: 15px" class="display-4"><b>Title: </b>{{movie.title}}</h6>
                        <h6 style="font-size: 14px" class="bold padding-bottom-7 display-4"><b>Rating: {{movie.vote_average}}</b><small> / 10</small></h6>

                    <button id="book-movies-btn" type="button" class="btn btn-primary btn-lg">Book</button>
                    </div>
                      </router-link>


                      </div>
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
h6{
  padding: 20%;
  margin: 0 auto;
}
.img-fluid {
  max-width: 100%;
  height: auto;
}
.zoom {
    transition: transform .4; /* Animation */

    margin: 0 auto;
}

.zoom:hover {
    transform: scale(1.1); /* (150% zoom - Note: if the zoom is too large, it will go outside of the viewport) */
}

.hovereffect {
  width: 100%;
  height: 100%;
  float: left;
  overflow: hidden;
  position: relative;
  cursor: default;
  background: #42b078;
}

.hovereffect .overlay {
  width: 100%;
  height: 100%;
  position: absolute;
  overflow: hidden;
  left: 0;
  bottom: 0;
  padding: 0px 0px;
}

.hovereffect img {
  display: block;
  position: relative;
  max-width: none;
  width: calc(100% + 20px);
  -webkit-transition: opacity 0.35s, -webkit-transform 0.35s;
  transition: opacity 0.35s, transform 0.35s;
  -webkit-transform: translate3d(-10px,0,0);
  transform: translate3d(-10px,0,0);
  -webkit-backface-visibility: hidden;
  backface-visibility: hidden;
}

.hovereffect:hover img {
  opacity: 0.4;
  filter: alpha(opacity=40);
  -webkit-transform: translate3d(0,0,0);
  transform: translate3d(0,0,0);
}

.hovereffect h2 {
  text-transform: uppercase;
  color: #fff;
  text-align: center;
  position: relative;
  font-size: 17px;
  overflow: hidden;
  padding: 0.5em 0;
  background-color: transparent;
}

.hovereffect h2:after {
  position: absolute;
  bottom: 0;
  left: 0;
  width: 100%;
  height: 2px;
  background: #fff;
  content: '';
  -webkit-transition: -webkit-transform 0.35s;
  transition: transform 0.35s;
  -webkit-transform: translate3d(-100%,0,0);
  transform: translate3d(-100%,0,0);
}

.hovereffect:hover h2:after {
  -webkit-transform: translate3d(0,0,0);
  transform: translate3d(0,0,0);
}

.hovereffect a, .hovereffect p {
  color: #FFF;
  opacity: 0;
  filter: alpha(opacity=0);
  -webkit-transition: opacity 0.35s, -webkit-transform 0.35s;
  transition: opacity 0.35s, transform 0.35s;
  -webkit-transform: translate3d(100%,0,0);
  transform: translate3d(100%,0,0);
}

.hovereffect:hover a, .hovereffect:hover p {
  opacity: 1;
  filter: alpha(opacity=100);
  -webkit-transform: translate3d(0,0,0);
  transform: translate3d(0,0,0);
}
</style>
