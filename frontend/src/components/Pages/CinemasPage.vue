<template>
<div>
  <ol class="breadcrumb">
    <li><router-link v-bind:to="'/home'">Home</router-link></li>
    <li class="active">Cinemas</li>
  </ol>
<img id="cinema-img" src="../../images/private-cinema.jpg" style="height:500px !important" width="100%" class="img-fluid" alt="Responsive image">
<div class="jumbotron">

<div class="container">

      <ul class="list-group"><h2>Opening Times</h2>
      <li class="list-group-item">Sunday: 10:00 - 01:00</li>
      <li class="list-group-item">Monday: 09:00 - 23:30</li>
      <li class="list-group-item">Tuesday: 09:00 - 23:30</li>
      <li class="list-group-item">Wednesday: 09:00 - 23:30</li>
      <li class="list-group-item">Thursday: 09:00 - 23:30</li>
      <li class="list-group-item">Friday: 09:00 - 01:00</li>
      <li class="list-group-item">Saturday: 10:00 - 01:00</li>
      </ul>

      <h2>Getting Here</h2>
        <h2>Salford Location:</h2>
        <h3>QA Cinema, The Quays, Salford M50 3AH</h3>
        <h3>Public transport Public transport</h3>
        <h3>By Train</h3>
        <h4>Salford Railway station is 0.2 miles away from the cinema.</h4>
        <h3>By Tram</h3>
        <h4>Metro-Link is within 0.1 miles away from the cinema.</h4>
        <h3>By Bus</h3>
        <h4>Bus stop right outside the cinema. Variety of buses as this is the main stop.</h4>

      <h3>Google Maps</h3>
      <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2374.6829865335117!2d-2.292395484156737!3d53.47412548000601!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x487bae14c88a552b%3A0xe02cfe2c69d3b568!2sThe+Quays%2C+Salford!5e0!3m2!1sen!2suk!4v1534362081707"
      width="900" height="450" frameborder="0" style="border:0" allowfullscreen></iframe>

      <h2>Facilities</h2>

      <h3>Screens</h3>
      <h4>2D and 3D</h4>
      <h4>Disabled Parking</h4>
      <h3>Accessibility</h3>
      <h4>Disabled access - We offer a step free access</h4>
      <h4>Disabled Parking is available</h4>

</div>

  </div>
  </div>


</template>

<script>

  export default {
    data() {
      return {
        showTab: false
      }
    },
    methods: {

    }
  }

</script>
<style scoped>
.breadcrumb {
  margin-top: -7px;
  height: 50px;
  padding-top: 20px;
}

#cinema-img {
  margin-top: -20px;
}
</style>
<style>
.nav{ -webkit-appearance: none; padding: 10px 20px; border: 0; margin-bottom: 20px; }
.nav{ display: flex; justify-content: space-between; align-items: center; }
.nav { color: black; text-decoration: none; font-size: 20px; }
</style>
