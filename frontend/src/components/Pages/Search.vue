<template>
  <div>
      <div class="jumbotron">
      <h1 name="upcoming" class="display-3">Upcoming movies</h1>

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

</style>
