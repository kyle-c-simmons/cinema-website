<template>
<div>
  <ol class="breadcrumb">
    <li>
      <router-link v-bind:to="'/home'">Home</router-link>
    </li>
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
                    <div class="row">
                      <div class="col-sm-4 col-md-12">
                        <div class="panel panel-default">
                          <div class="panel-body">
                            <form accept-charset="UTF-8">
                              <textarea type="text" v-model="generalMessage" class="form-control counted" name="generalMessages" placeholder="Type in your message" rows="5" style="margin-bottom:10px;"></textarea>
                              <button @click="postGeneralMessage" class="btn btn-info" type="submit">Post New Message</button>
                            </form>
                          </div>
                        </div>
                      </div>
                    </div>
                    <tbody>
                      <tr>

                        <td>
                          <div v-for="message in generalMessagesAPI" class="panel panel-default">
                            <div class="panel-heading">
                              <h3 class="panel-title"> {{ message.creationDate }}</h3>
                            </div>
                            <div class="panel-body">
                              {{ message.text }}
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
                            <div class="panel-body">
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
                            <div class="panel-body">
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




    <div>

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

<script>
import axios from 'axios';

export default {
  data() {
    return {
      messages: '',
      thread_: false,
      generalMessagesAPI: '',
      generalMessage: '',
      isSubmitted: false
    }
  },
  methods: {
    postGeneralMessage() {


    }
  },
  created() {
    axios.get('http://localhost:8089/generalmessages')
      .then(res => {
        console.log("General messages: " + res.data)
        this.generalMessagesAPI = res.data;
      })
      .catch(error => console.log(error));
    var name = this.generalMessage = generalMessages.value;
    axios.post('http://localhost:8089/generalmessages', {
        text: 'name'
      })
      .then(function(response) {
        console.log('saved successfully')
      });
  }
}
</script>
