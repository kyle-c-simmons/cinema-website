<template>
    <div >
      <div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="4000">
        <!-- Indicators -->
        <ol class="carousel-indicators">
          <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
          <li data-target="#myCarousel" data-slide-to="1"></li>
          <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner">
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
    </div>

</template>

<script>
</script>

<style>
.carousel-inner {
  width:640;
  height:500px;
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
