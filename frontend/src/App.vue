<template>
  <div id="app" class="container text-center">
    <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top full-width">
     <div  id="container-nav" class="container-fluid">
       <a class="navbar-brand"><router-link v-bind:to="'/home'"><img src="../src/images/logo.jpg"><span>Cinemas</span></router-link></a>
       <button  id="nav-toggle-button" class="navbar-toggle navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse"
       data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="true" aria-label="Toggle navigation">
         <span class="navbar-toggler-icon"></span>
       </button>
       <div class="collapse navbar-collapse" id="navbarResponsive">
         <ul style="float: right;" class="navbar-nav ml-auto">
           <li class="nav-item">
             <a class="nav-link"><router-link v-bind:to="'/home'"><span class="glyphicon glyphicon-home"></span></router-link></a>
           </li>
           <li class="nav-item">
             <a bgcolor="blue"class="nav-link"><router-link v-bind:to="'/forum'">Forum</router-link></a>
           </li>
           <li class="nav-item">
             <a bgcolor="blue"class="nav-link"><router-link v-bind:to="'/cinemas'">Cinemas</router-link></a>
           </li>
           <li class="nav-item dropdown">
             <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownPortfolio" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
               What's on
             </a>
             <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownPortfolio">
               <a class="dropdown-item"><router-link v-bind:to="'/newrelease'">New releases</router-link></a>
               <a class="dropdown-item"><router-link v-bind:to="'/movielist'">Listings</router-link></a>
             </div>
           </li>

           <li class="nav-item dropdown">
             <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownPortfolio" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
               Information
             </a>
             <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownPortfolio">
               <a class="dropdown-item"><router-link v-bind:to="'/classifications'">Classifications</router-link></a>
               <a class="dropdown-item"><router-link v-bind:to="'/places-to-go'">Places To Go</router-link></a>

            </div>
           </li>
           <li class="nav-item">
             <button style="margin-top: 10px" type="button" class="btn btn-primary" data-toggle="modal" data-target="#loginModal">Login</button>
             <button style="margin-top: 10px" type="button" class="btn btn-danger" data-toggle="modal" data-target="#registerModal">Register</button>
           </li>

         </ul>
       </div>
     </div>
   </nav>
   <router-view></router-view>
   <div class="modal fade" id="loginModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Login</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <form>
          <div class="form-group">
            <input placeholder="Username" type="text" class="form-control" id="recipient-name">
          </div>
          <div class="form-group">
            <input type="password" id="inputPassword" class="form-control" placeholder="Password" required="">
          </div>
        </form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Login</button>
      </div>
    </div>
  </div>
</div>

<div class="modal fade" id="registerModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
<div class="modal-dialog" role="document">
 <div class="modal-content">
   <div class="modal-header">
     <h5 class="modal-title" id="exampleModalLabel">Register</h5>
     <button type="button" class="close" data-dismiss="modal" aria-label="Close">
       <span aria-hidden="true">&times;</span>
     </button>
   </div>
   <div class="modal-body">
     <form>
       <div class="form-group">
         <input placeholder="Enter Username" type="text" class="form-control" id="recipient-name">
       </div>
       <div class="form-group">
         <input type="password" id="inputPassword" class="form-control" placeholder="Password" required="">
       </div>
       <div class="form-group">
         <input type="password" id="confirmPassword" class="form-control" placeholder="Confirm Password" required="">
       </div>
     </form>
   </div>
   <div class="modal-footer">
     <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
     <button type="button" class="btn btn-primary">Register</button>
   </div>
 </div>
</div>
</div>

   <component><Footer></Footer></component>
  </div>
</template>

<script>
import Header from './components/Header'

import Footer from './components/Footer'

import HomePage from './components/Pages/HomePage'

export default {
  components: { Footer}
}

</script>

<style lang="scss">

// Bootstrap
$icon-font-path: '../node_modules/bootstrap-sass/assets/fonts/bootstrap/';
$link-color: black;
$brand-success: #42b983;
@import 'node_modules/bootstrap-sass/assets/stylesheets/bootstrap';

// font awesome
$fa-font-path: '../node_modules/font-awesome/fonts/';
@import 'node_modules/font-awesome/scss/font-awesome';
@import url('https://fonts.googleapis.com/css?family=Fira+Sans+Condensed');
@import url('https://fonts.googleapis.com/css?family=Black+Ops+One');

body {
    background-image: url("../src/images/background2.png");
  }

p {
    color: blue;
    text-align: justify;
  }

.navbar {
  background-color: #ffffff !important;
  margin-bottom: -0px !important;
}

.navbar-nav li {
  margin: 0px 20px;
  padding: 14px 0px !important;

  a {
    color: #4d4d4d !important;
    font-size: 18px;
    font-family: 'Fira Sans Condensed', sans-serif;
    text-decoration: none;
  }

  a:hover {
    background-color: #f5f5f5 !important;

  }
}

#nav-toggle-button{
    background-color: #4d4d4d;
}

.navbar-brand {
  margin-bottom: 22px;
  font-family: 'Black Ops One', cursive;
  font-size: 24px;

  a {
    text-decoration: none;
  }

  img {
    width: 60px;
    height: 50px;
  }
  span {
    color: #0d5ca8;
  }
}

</style>
