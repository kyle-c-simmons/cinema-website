<template>
  <div>
      <div class="jumbotron">
      <h1 name="upcoming" class="display-3">Upcoming movies</h1>
          <div class="row">

        <div class="col-md-12">

            <div id="mdb-lightbox-ui"></div>

            <div id="top-6-movies" class="mdb-lightbox no-margin">

                <figure id="eachMovieHomePage" class="col-lg-3" v-for="movie, index in kidsMovies" :key="movie.id" v-if="index < 8"">
                  <div class="zoom">
                  <router-link
                    :to="{name: 'movieDetails', name: 'movieDetailsId', params: { id: movie.id }}">
                    <img class="img-fluid img-thumbnail" alt="picture" v-bind:src="'http://image.tmdb.org/t/p/w342' + movie.poster_path">
                      </router-link>
                    </div>
                        <h6 style="font-size: 15px" class="display-4"><b>Title:</b> {{movie.title}}</h6>
                        <h6 style="font-size: 14px" class="bold padding-bottom-7 display-4"><b>Release date:</b> {{movie.release_date}}<small></small></h6>

                </figure>

              </div>
            </div>
        </div>
      </div>

      <div class="jumbotron">
        <h1 class="display-3">What's popular</h1>
            <div class="row">

          <div class="col-md-12">

              <div id="mdb-lightbox-ui"></div>

              <div id="top-6-movies" class="mdb-lightbox no-margin">

                  <figure id="eachMovieHomePage" class="col-lg-3" v-for="movie, index in popularMovies" :key="movie.id" v-if="index < 8"">
                    <div class="zoom">
                    <router-link
                      :to="{name: 'movieDetails', name: 'movieDetailsId', params: { id: movie.id }}">
                      <img class="img-fluid img-thumbnail" alt="picture" v-bind:src="'http://image.tmdb.org/t/p/w342' + movie.poster_path">
                      <button id="book-movies-btn" type="button" class="btn btn-primary center-block btn-lg">Book</button>
                        </router-link>
                      </div>
                        <h6 style="font-size: 15px" class="display-4"><b>Title:</b> {{movie.title}}</h6>
                        <h6 style="font-size: 14px" class="bold padding-bottom-7 display-4"><b>Rate: {{movie.vote_average}}</b><small> / 10</small></h6>
                        <h6 style="font-size: 14px" class="bold padding-bottom-7 display-4"><b>Release date:</b> {{movie.release_date}}<small></small></h6>
                  </figure>
              </div>
          </div>
        </div>
    </div>

    <div class="jumbotron">
      <h1 class="display-3">Most voted</h1>
          <div class="row">
        <div class="col-md-12">

            <div id="mdb-lightbox-ui"></div>

            <div id="top-6-movies" class="mdb-lightbox no-margin">

                <figure id="eachMovieHomePage" class="col-lg-3" v-for="movie, index in mostVoted" :key="movie.id" v-if="index < 4"">
                  <div class="zoom">
                  <router-link
                    :to="{name: 'movieDetails', name: 'movieDetailsId', params: { id: movie.id }}">
                    <img class="img-fluid img-thumbnail" alt="picture" v-bind:src="'http://image.tmdb.org/t/p/w342' + movie.poster_path">
                    <button id="book-movies-btn" type="button" class="btn btn-primary center-block btn-lg">Book</button>
                      </router-link>
                      </div>
                      <h6 style="font-size: 15px" class="display-4"><b>Title:</b> {{movie.title}}</h6>
                      <h6 style="font-size: 14px" class="bold padding-bottom-7 display-4"><b>Rate: {{movie.vote_average}}</b><small> / 10</small></h6>
                      <h6 style="font-size: 14px" class="bold padding-bottom-7 display-4"><b>Release date:</b> {{movie.release_date}}<small></small></h6>
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
      popularMovies: [''],
      kidsMovies: [''],
      mostVoted: ['']
    }
  },
  created() {
    axios.get('https://api.themoviedb.org/3/discover/movie?api_key=8813ca16ebe669fec2836395a2928dbc&language=en-GB&sort_by=popularity.desc')
    .then(res => {
      console.log(res)
      this.popularMovies = res.data.results;
      console.log(this.popularMovies)
    })
    .catch(error => console.log(error));
    axios.get('https://api.themoviedb.org/3/movie/upcoming?api_key=8813ca16ebe669fec2836395a2928dbc&language=en-GB&region=US')
    .then(res => {
      console.log(res)
      this.kidsMovies = res.data.results;
      console.log(this.kidsMovies)
    })
    .catch(error => console.log(error));
    axios.get('https://api.themoviedb.org/3/discover/movie?api_key=8813ca16ebe669fec2836395a2928dbc&language=en-GB&sort_by=vote_average.desc&vote_count.gte=10')
    .then(res => {
      console.log(res)
      this.mostVoted = res.data.results;
      console.log(this.mostVoted)
    })
    .catch(error => console.log(error));
  }
}
</script>

<style scoped>
.zoom {
    transition: transform .2; /* Animation */

    margin: 0 auto;
}

.zoom:hover {
    transform: scale(1.2); /* (150% zoom - Note: if the zoom is too large, it will go outside of the viewport) */
}
</style>
