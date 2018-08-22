<template>
  <!-- Footer -->
  <footer class="page-footer font-small blue-grey lighten-5">

      <div style="background-color: #ffffff;">
        <div class="container">

          <!-- Grid row-->
          <div class="row py-4 d-flex align-items-center">

            <!-- Grid column -->
            <div class="col-md-6 col-lg-5 text-center text-md-left mb-4 mb-md-0">
                  <a class="navbar-brand"><router-link v-bind:to="'/home'"><img src="../../src/images/logo.jpg"><span>Cinemas</span></router-link></a>
            </div>
            <!-- Grid column -->

            <!-- Grid column -->
            <div style="padding-right: 60px;" class="col-md-6 col-lg-7 text-center text-md-right">

              <!-- Facebook -->
              <a class="fb-ic">
                <i class="fa fa-facebook white-text mr-4"> </i>
              </a>
              <!-- Twitter -->
              <a class="tw-ic">
                <i class="fa fa-twitter white-text mr-4"> </i>
              </a>
              <!-- Google +-->
              <a class="gplus-ic">
                <i class="fa fa-google-plus white-text mr-4"> </i>
              </a>
              <!--Linkedin -->
              <a class="li-ic">
                <i class="fa fa-linkedin white-text mr-4"> </i>
              </a>
              <!--Instagram-->
              <a class="ins-ic">
                <i class="fa fa-instagram white-text"> </i>
              </a>

            </div>
            <!-- Grid column -->

          </div>
          <!-- Grid row-->

        </div>
      </div>

      <!-- Footer Links -->
      <div style=""class="container text-center text-md-left mt-5">

        <!-- Grid row -->
        <div class="row mt-3 dark-grey-text">

          <!-- Grid column -->
          <div class="col-md-3 col-lg-4 col-xl-3 mb-4">

            <!-- Content -->
            <h6 class="text-uppercase font-weight-bold">QA Cinemas</h6>
            <hr class="teal accent-3 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px;">
            <p>Welcome to QA Cinemas. We are the number ONE cinemas.</p>

          </div>
          <!-- Grid column -->

          <!-- Grid column -->
          <div class="col-md-2 col-lg-2 col-xl-2 mx-auto mb-4">

            <!-- Links -->
            <h6 class="text-uppercase font-weight-bold">Support</h6>
            <hr class="teal accent-3 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px;">
            <p>
              <a><router-link style="color: #fff !important"v-bind:to="'/aboutus'">About Us</router-link></a>
            </p>
            <p>
              <a class="dark-grey-text">Contact Us</a>
            </p>
            <p>
              <a><router-link style="color: #fff !important" v-bind:to="'/faq'">FAQ</router-link></a>
            </p>
            <p>
              <a><router-link style="color: #fff !important" v-bind:to="'/termsAndcondition'">Terms and Conditions</router-link></a>
            </p>


          </div>
          <!-- Grid column -->

          <!-- Grid column -->
          <div class="col-md-3 col-lg-2 col-xl-2 mx-auto mb-4">

            <!-- Links -->
            <h6 class="text-uppercase font-weight-bold">Account</h6>
            <hr class="teal accent-3 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px;">
            <p>
              <a class="dark-grey-text" href="#!">Login</a>
            </p>
            <p>
              <a class="dark-grey-text" href="#!">Sign up</a>
            </p>
            <p>
              <a class="dark-grey-text" href="#!"></a>
            </p>

          </div>
          <!-- Grid column -->

          <!-- Grid column -->
          <div  class="col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4">

            <!-- Links -->
            <h6 class="text-uppercase font-weight-bold">Contact</h6>
            <hr class="teal accent-3 mb-4 mt-0 d-inline-block mx-auto" style="width: 60px;">
            <p>
              <i class="fa fa-home mr-3"></i> New York, NY 10012, US</p>
            <p>
              <i class="fa fa-envelope mr-3"></i> info@example.com</p>
            <p>
              <i class="fa fa-phone mr-3"></i> + 01 234 567 88</p>
            <p>
              <i class="fa fa-print mr-3"></i> + 01 234 567 89</p>

          </div>
          <!-- Grid column -->

        </div>
        <!-- Grid row -->

      </div>
      <!-- Footer Links -->

      <!-- Copyright -->
      <div style="color: #fff !important" class="footer-copyright text-center  py-3">© 2018 Copyright:
        <a style="color: #67ff8b !important" href="https://api.themoviedb.org/3/movie/550?api_key=8813ca16ebe669fec2836395a2928dbc"> qa-cinemas.com</a>
      </div>
      <!-- Copyright -->

    </footer>
    <!-- Footer -->
</template>

<script>
  export default {
  }
</script>

<style>
  footer {
    background: #03396c !important;
  }

  footer a {
    color: #000 !important;
  }
  footer p {
    color: #ffffff !important;
  }
  footer h6 {
    color: #67ff8b;
  }
  .dark-grey-text {
    color: #ffffff !important;
  }


</style>
