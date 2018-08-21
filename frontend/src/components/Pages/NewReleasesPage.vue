<template>
    <div class="container">
      <h2>Carousel Example</h2>
      <div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="4000">
        <!-- Indicators -->
        <ol class="carousel-indicators">
          <li data-target="#myCarousel" data-slide-to="0"></li>
          <li data-target="#myCarousel" data-slide-to="1"></li>
          <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner">
          <div class="item active">
            <div class="row">
              <div class="col-lg-3">
                <div class="caption center-block">Test</div>
            <img src="/static/Mamamoo.full.166902.jpg" class="figure-img img-fluid rounded" alt="Los Angeles">


          </div>
          <div class="col-lg-3">
            <img src="/static/mamamoo61.jpg"  class="img-rounded" alt="Chicago">
          </div>
          <div class="col-lg-3">
            <img src="/static/mamamoo61.jpg"  class="img-rounded" alt="Chicago">
          </div>
          <div class="col-lg-3">
            <img src="/static/Mamamoo.full.166902.jpg"  class="img-rounded" alt="New york">
          </div>
        </div>
          </div>

          <div class="item">
            <div class="row">
            <div class="col-lg-3">
            <img src="/static/Mamamoo.full.166902.jpg"  class="img-rounded" alt="Los Angeles">
          </div>
        <div class="col-lg-3">
            <img src="/static/mamamoo61.jpg"  class="img-rounded" alt="Chicago">
          </div>
        <div class="col-lg-3">
            <img src="/static/Mamamoo.full.166902.jpg"  class="img-rounded" alt="New york">
          </div>
        <div class="col-lg-3">
            <img src="/static/mamamoo61.jpg"  class="img-rounded" alt="Chicago">
          </div>
        </div>
          </div>

          <div class="item">
            <div class="row">
            <div class="col-lg-3">
              <img src="/static/mamamoo61.jpg"  class="img-rounded" alt="Chicago">
          </div>
          <div class="col-lg-3">

            <img src="/static/Mamamoo.full.166902.jpg"  class="img-rounded" alt="Los Angeles">
          </div>
          <div class="col-lg-3">
            <img src="/static/Mamamoo.full.166902.jpg"  class="img-rounded" alt="New york">
          </div>
          <div class="col-lg-3">
            <img src="/static/mamamoo61.jpg"  class="img-rounded" alt="Chicago">
          </div>
          </div>
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

          <br>
          <br>
      </div>
    </div>



</template>

<script>
</script>

<style>
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
