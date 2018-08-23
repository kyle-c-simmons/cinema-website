<template>
  <div>
  <ol class="breadcrumb">
    <li><router-link v-bind:to="'/home'">Home</router-link></li>
    <li class="active">Forum</li>
  </ol>
  <div class="jumbotron">
    <h1 class="display-3">Discussion Board</h1><br><br>


    <div class="container">
        <div class="panel-group" id="accordion">
        <div class="panel panel-default">
          <div class="panel-heading">
            <h4 class="panel-title">
              <a data-toggle="collapse" data-parent="#accordion" href="#collapse1">General Discussion</a>
            </h4>
          </div>
          <div id="collapse1" class="panel-collapse collapse in">
            <div class="panel-body">

              <div class="row">
                <div class="col-md-8">
                </div>
                <div class="col-md-12">
                  <table id="myTable" width="100%">
                    <thead>
                      <tr>
                        <th>Messages</th><br></br>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td>
                          <div class="panel panel-default">
                            <div class="panel-heading">
                              <h3 class="panel-title">Username and date</h3>
                            </div>
                            <div class="panel-body" >
                              description
                            </div>
                          </div>
                        </td>
                      </tr>
                    </tbody>
                  </table>
                </div>
              </div>


            </div>
          </div>
        </div>
        <div class="panel panel-default">
          <div class="panel-heading">
            <h4 class="panel-title">
              <a data-toggle="collapse" data-parent="#accordion" href="#collapse2">New Movies</a>
            </h4>
          </div>
          <div id="collapse2" class="panel-collapse collapse">
            <div class="panel-body">

              <div class="row">
                <div class="col-md-8">
                </div>
                <div class="col-md-12">
                  <table id="myTable" width="100%">
                    <thead>
                      <tr>
                        <th>Messages</th><br></br>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td>
                          <div class="panel panel-default">
                            <div class="panel-heading">
                              <h3 class="panel-title">Username and date</h3>
                            </div>
                            <div class="panel-body" >
                              description
                            </div>
                          </div>
                        </td>
                      </tr>
                    </tbody>
                  </table>
                </div>
              </div>



            </div>
          </div>
        </div>
        <div class="panel panel-default">
          <div class="panel-heading">
            <h4 class="panel-title">
              <a data-toggle="collapse" data-parent="#accordion" href="#collapse3">Introductions</a>
            </h4>
          </div>
          <div id="collapse3" class="panel-collapse collapse">
            <div class="panel-body">

              <div class="row">
                <div class="col-md-8">
                </div>
                <div class="col-md-12">
                  <table id="myTable" width="100%">
                    <thead>
                      <tr>
                        <th>Messages</th><br></br>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td>
                          <div class="panel panel-default">
                            <div class="panel-heading">
                              <h3 class="panel-title">Username and date</h3>
                            </div>
                            <div class="panel-body" >
                              description
                            </div>
                          </div>
                        </td>
                      </tr>
                    </tbody>
                  </table>
                </div>
              </div>



            </div>
          </div>
        </div>
      </div>
    </div>




    <div >

    </div>
  </div>
  </div>
</template>
<style scoped>
.breadcrumb {
  margin-top: -7px;
  height: 50px;
  padding-top: 20px;
}

.jumbotron {
  margin-top: -20px;
}
</style>

export default{

  name: 'main-forum',
  data() {
    return {
      messages: '',
      thread_: false
    }
  },
  created: function () {
    this.getMessages();
  },
  methods: {
        getMessages () {

        }

  }
}


</script>
<script type="text/javascript">


</script>
