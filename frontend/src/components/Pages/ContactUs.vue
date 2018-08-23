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
        <label for="first_name">First Name *</label>
        </td>
        <td valign="top">
        <input  type="text" name="first_name" maxlength="50" size="30">
        </td>
        </tr>

        <tr>
        <td valign="top">
        <label for="last_name">Last Name *</label>
        </td>
        <td valign="top">
        <input  type="text" name="last_name" maxlength="50" size="30">
        </td>
        </tr>

        <tr>
        <td valign="top">
        <label for="email">Email Address *</label>
        </td>
        <td valign="top">
        <input  type="text" name="email" maxlength="80" size="30">
        </td>
        </tr>

        <tr>
        <td valign="top">
        <label for="telephone">Telephone Number</label>
        </td>
        <td valign="top">
        <input  type="text" name="telephone" maxlength="30" size="30">
        </td>
        </tr>
        <tr>

        <td valign="top">
        <label for="comments">Comments *</label>
        </td>
        <td valign="top">
        <textarea  name="comments" maxlength="1000" cols="25" rows="6"></textarea>
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

<style></style>
