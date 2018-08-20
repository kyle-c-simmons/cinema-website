<template>
  <div>


    <div class="outer-container">
    <div class="video-container">
            <iframe width="560" height="315" :src="'https://www.youtube.com/embed/' + this.youtubeMovieId + '?autoplay=1'" frameborder="0" allowfullscreen></iframe>
    </div>
  </div>


      <div class="jumbotron">
      <p>User loaded has ID: {{ $route.params.id }}</p>


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
        youtubeMovieId: ''
      }
    },
    created() {
      axios.get('https://api.themoviedb.org/3/movie/' + this.getMovieId + '/videos?api_key=8813ca16ebe669fec2836395a2928dbc&language=en-GB')
      .then(res => {
        console.log(res.data.results[0].key)
        this.youtubeMovieId = res.data.results[0].key;
      })
      .catch(error => console.log(error))

    }
  }

</script>

<style scoped>

.class video-player-box {
  width: 100% !important;
}
.outer-container{
    width:100%
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

</style>
