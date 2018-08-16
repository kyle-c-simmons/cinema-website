<template>
    <div >
      <div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="3500">
        <!-- Indicators -->
        <ol class="carousel-indicators">
          <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
          <li data-target="#myCarousel" data-slide-to="1"></li>
          <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>

        <!-- Wrapper for slides -->
        <div id="home-sldier" class="carousel-inner">
          <div class="item active">
            <img src="../../images/image-slide-1.jpg" alt="Los Angeles">
          </div>

          <div class="item">
            <img src="../../images/image-slide-2.jpg" alt="Chicago">
          </div>

          <div class="item">
            <img src="../../images/image-slide-3.jpg" alt="New york">
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
      <h2>Top 6 Movies</h2>
        <div class="row">

      <div class="col-md-12">

          <div id="mdb-lightbox-ui"></div>

          <div id="top-6-movies" class="mdb-lightbox no-margin">

              <figure class="col-md-4">
                  <a class="black-text" href="https://mdbootstrap.com/img/Photos/Horizontal/Nature/12-col/img%20(121).jpg" data-size="1600x1067">
                      <img alt="picture" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(121).jpg" class="img-fluid">
                      <h3 class="text-center my-3">Photo title</h3>
                  </a>
              </figure>

              <figure class="col-md-4">
                  <a class="black-text" href="https://mdbootstrap.com/img/Photos/Horizontal/Nature/12-col/img%20(96).jpg" data-size="1600x1067">
                      <img alt="picture" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(96).jpg" class="img-fluid" />
                      <h3 class="text-center my-3">Photo title</h3>
                  </a>
              </figure>

              <figure class="col-md-4">
                  <a class="black-text" href="https://mdbootstrap.com/img/Photos/Horizontal/Nature/12-col/img%20(104).jpg" data-size="1600x1067">
                      <img alt="picture" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(104).jpg" class="img-fluid" />
                      <h3 class="text-center my-3">Photo title</h3>
                  </a>
              </figure>

              <figure class="col-md-4">
                  <a class="black-text" href="https://mdbootstrap.com/img/Photos/Horizontal/Nature/12-col/img%20(45).jpg" data-size="1600x1067">
                      <img alt="picture" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(45).jpg" class="img-fluid" />
                      <h3 class="text-center my-3">Photo title</h3>
                  </a>
              </figure>

              <figure class="col-md-4">
                  <a class="black-text" href="https://mdbootstrap.com/img/Photos/Horizontal/Nature/12-col/img%20(122).jpg" data-size="1600x1067">
                      <img alt="picture" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(122).jpg" class="img-fluid" />
                      <h3 class="text-center my-3">Photo title</h3>
                  </a>
              </figure>

              <figure class="col-md-4">
                  <a class="black-text" href="https://mdbootstrap.com/img/Photos/Horizontal/Nature/12-col/img%20(115).jpg" data-size="1600x1067">
                      <img alt="picture" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(115).jpg" class="img-fluid" />
                      <h3 class="text-center my-3">Photo title</h3>
                  </a>
              </figure>
          </div>
          <button id="movies-button" type="button" class="btn btn-primary">More Movies</button>
      </div>
    </div>
  </div>
</div>

</template>

<script>
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
    margin-top: 40px !important;
  }

  .item img {
    height: 550px !important;
    width: 100% !important;
  }

</style>
