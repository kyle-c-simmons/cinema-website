<template>
  <div id="contact-us"><br>

    <div class="jumbotron">
      <div class="container-fluid text-center">

        <h2>Contact Form </h2>
        <p>Your feedback is important to us..</p>

          <form name="contactform" method="post" action="send_form_email.php">
          <table width="450px">
        <tr>
        <td valign="top">
        </td>
        <td valign="top">
        <input  type="text" name="first_name" maxlength="50" size="30" placeholder="Firstname">
        </td>
        </tr>

        <tr>
        <td valign="top">
        </td>
        <td valign="top">
        <input  type="text" name="last_name" maxlength="50" size="30" placeholder="Lastname">
        </td>
        </tr>

        <tr>
        <td valign="top">
        </td>
        <td valign="top">
        <input  type="text" name="email" maxlength="80" size="30" placeholder="Email">
        </td>
        </tr>

        <tr>
        <td valign="top">

        </td>
        <td valign="top">
        <input  type="text" name="telephone" maxlength="30" size="30" placeholder="Number">
        </td>
        </tr>
        <tr>

        <td valign="top">
        </td>
        <td valign="top">
        <textarea  name="comments" maxlength="1000" cols="25" rows="6"placeholder= "Comments"></textarea>
        </td>
        </tr>
        <tr>
        <td colspan="2" style="text-align:center">
        <input type="submit" value="Submit">
        </td>
        </tr>

        </table>

        </form>

      </div>
    </div>

  </div>

</template>

<script>
  function send() {
    var link = 'mailto:andrew.freitas@academytrainee.com?subject=Message from '
                +document.getElementById('email').value
                +'&body='+document.getElementById('email').value;
    window.location.href = link;
  }
</script>

<style>
.text-center{
  padding-left: 500px;
}
</style>
