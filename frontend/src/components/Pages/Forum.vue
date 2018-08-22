<template>
  <div class="jumbotron">
    <div >
      <div class="row">
        <div class="col-md-4">
        </div>
        <div class="col-md-8">
          <table id="myTable" width="100%">
            <thead>
              <tr>
                <th>Message List</th>
              </tr>
            </thead>
            <tbody>
              <tr v-for="message in messages">
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
      <div id="bottom"></div>
    </div>
  </div>
</template>

<script>


export default{

  name: 'main-forum',
  data() {
    return {
      messages: ''
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
