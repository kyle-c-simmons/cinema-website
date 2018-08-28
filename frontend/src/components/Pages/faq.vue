<template>
<div class="jumbotron">
  <h1>FAQs</h1>
  <div class="container ">
    <div class="panel-group" id="faqAccordion">
      <!-- tab1 -->
      <div class="panel panel-default ">
        <div class="panel-heading accordion-toggle question-toggle collapsed" data-toggle="collapse" data-parent="#faqAccordion" data-target="#question0">
          <h4 class="panel-title">
                    <a href="#" class="ing">Q: Can I bring food from outside?</a>
              </h4>

        </div>
        <div id="question0" class="panel-collapse collapse" style="height: 0px;">
          <div class="panel-body">
            <h5><span class="label label-primary">Answer</span></h5>

            <p>Yes - we allow food from outside to be eaten in our cinemas,however no hot food or alcohol.</p>
          </div>
        </div>
      </div>
      <!-- tab2 -->
      <div class="panel panel-default ">
        <div class="panel-heading accordion-toggle collapsed question-toggle" data-toggle="collapse" data-parent="#faqAccordion" data-target="#question1">
          <h4 class="panel-title">
                    <a href="#" class="ing">Q: What happens if I lose my gift card or it is stolen?</a>
              </h4>

        </div>
        <div id="question1" class="panel-collapse collapse" style="height: 0px;">
          <div class="panel-body">
            <h5><span class="label label-primary">Answer</span></h5>

            <p>The gift card must be treated as cash, please keep it safe, if it is lost or stolen QA Cinema cannot accept any responsibility.</p>
          </div>
        </div>
      </div>
      <!-- tab3 -->
      <div class="panel panel-default ">
        <div class="panel-heading accordion-toggle collapsed question-toggle" data-toggle="collapse" data-parent="#faqAccordion" data-target="#question2">
          <h4 class="panel-title">
                    <a href="#" class="ing">Q: How much time do the adverts and trailers take up?</a>
              </h4>

        </div>
        <div id="question2" class="panel-collapse collapse" style="height: 0px;">
          <div class="panel-body">
            <h5><span class="label label-primary">Answer</span></h5>

            <p>Advert and trailer length is typically around 15 minutes however varies with each movie. We always recommend to avoid disappointment you arrive with enough time to enter the screen at the start time.</p>
          </div>
        </div>
      </div>
      <!-- tab4 -->
      <div class="panel panel-default ">
        <div class="panel-heading accordion-toggle collapsed question-toggle" data-toggle="collapse" data-parent="#faqAccordion" data-target="#question3">
          <h4 class="panel-title">
                    <a href="#" class="ing">Q: Does QA Cinema offer wheelchair access?</a>
              </h4>

        </div>
        <div id="question3" class="panel-collapse collapse" style="height: 0px;">
          <div class="panel-body">
            <h5><span class="label label-primary">Answer</span></h5>

            <p>QA Cinema, Salford offers wheelchair access. Please ask a member of our team on arrival should you need any assistance during your visit.</p>
          </div>
        </div>
      </div>
      <!-- tab5 -->
      <div class="panel panel-default ">
        <div class="panel-heading accordion-toggle collapsed question-toggle" data-toggle="collapse" data-parent="#faqAccordion" data-target="#question4">
          <h4 class="panel-title">
                    <a href="#" class="ing">Q: Who can I contact regarding lost property?</a>
              </h4>

        </div>
        <div id="question4" class="panel-collapse collapse" style="height: 0px;">
          <div class="panel-body">
            <h5><span class="label label-primary">Answer</span></h5>

            <p>We recommend that you revisit the cinema or call us on: + 01 234 567 88</p>
          </div>
        </div>
      </div>

      <!-- tab6 -->
      <div class="panel panel-default ">
        <div class="panel-heading accordion-toggle collapsed question-toggle" data-toggle="collapse" data-parent="#faqAccordion" data-target="#question5">
          <h4 class="panel-title">
                <a href="#" class="ing">Q: Is there parking available on site?</a>
          </h4>

        </div>
        <div id="question5" class="panel-collapse collapse" style="height: 0px;">
          <div class="panel-body">
            <h5><span class="label label-primary">Answer</span></h5>

            <p>There is parking available which is free after 6pm in the car park behind abc Gardens, a short walk from QA Cinema </p>
          </div>
        </div>
      </div>
      <!-- tab6 -->
      <div class="panel panel-default ">
        <div class="panel-heading accordion-toggle collapsed question-toggle" data-toggle="collapse" data-parent="#faqAccordion" data-target="#question6">
          <h4 class="panel-title">
                <a href="#" class="ing">Q: What to the film classifications mean?</a>
          </h4>

        </div>
        <div id="question6" class="panel-collapse collapse" style="height: 0px;">
          <div class="panel-body">
            <h5><span class="label label-primary">Answer</span></h5>

            <p>Visit our classifications page to see what each classification means.
              <router-link v-bind:to="'/classifications'"><br><u>click here to Classifications Page</u></router-link>
            </p>
          </div>
        </div>
      </div>
      <!-- tab6 -->
      <div class="panel panel-default ">
        <div class="panel-heading accordion-toggle collapsed question-toggle" data-toggle="collapse" data-parent="#faqAccordion" data-target="#question7">
          <h4 class="panel-title">
                <a href="#" class="ing">Q: Can I exchange or get a refund on my tickets?</a>
          </h4>

        </div>
        <div id="question7" class="panel-collapse collapse" style="height: 0px;">
          <div class="panel-body">
            <h5><span class="label label-primary">Answer</span></h5>

            <p>Sorry, we are unable to refund tickets unless a screening is cancelled. Refunds on tickets are not given if for any reason you can no longer attend.</p>
          </div>
        </div>
      </div>
    </div>
    <!--/panel-group-->
  </div>


</div>
</template>

<style scoped>
p {
  color: black !important;

  text-align: center;
}
</style>

<script>
</script>
