<template>
  <div class="about">
    <b-container class="bv-example-row">
      <b-row>
        <b-col>
          <h1>About As</h1>
        </b-col>
      </b-row>

      <b-row style="margin: 0 auto;">
        <b-col cols="6">
          <img id="aaa" src="@/assets/map.png" alt="" />
        </b-col>

        <b-col cols="6">
          <h1 style="position:absolute;top:50%;left:50%;transform: translate(-50%, -50%);">
            - 해피하우스는 지도정보를 통해 지역 부동산의 매매 정보, 학군 정보를 제공합니다.
          </h1>
        </b-col>
      </b-row>
      <hr id="hr" />

      <b-row style="margin: 0 auto;">
        <b-col cols="6">
          <img id="aaa" src="@/assets/kakao.png" alt="" />
        </b-col>

        <b-col cols="6">
          <h1 style="position:absolute;top:50%;left:50%;transform: translate(-50%, -50%);">
            - 사용자가 간편하게 로그인 할 수 있도록 소셜로그인 기능을 제공합니다.
          </h1>
        </b-col>
      </b-row>
      <hr id="hr" />
    </b-container>
    <hr id="hr" />
  </div>
</template>
<script>
export default {
  name: 'About',
  data() {
    return {};
  },
};
</script>
<style>
#aaa {
  height: 500px;
  width: 800px;
}
#hr {
  height: 5px;
}
</style>
