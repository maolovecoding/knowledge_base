<template>
  <a-layout>
    <!--    上-->
    <the-header/>
    <!--    中-->
    <router-view/>
    <!--    下-->
    <the-footer/>
  </a-layout>
</template>

<script lang="ts">
import {defineAsyncComponent} from "vue";

export default {
  name: "App",
  components: {
    "TheHeader":defineAsyncComponent(/* webpackChunkName:"the-header" */()=>import("./components/The-Header.vue")),
    "TheFooter":defineAsyncComponent(/* webpackChunkName:"the-header" */()=>import("./components/The-Footer.vue"))
  }
}
</script>
<style>
#components-layout-demo-top-side-2 .logo {
  float: left;
  width: 120px;
  height: 31px;
  margin: 16px 24px 16px 0;
  background: rgba(255, 255, 255, 0.3);
}

.ant-row-rtl #components-layout-demo-top-side-2 .logo {
  float: right;
  margin: 16px 0 16px 24px;
}

.site-layout-background {
  background: #fff;
}
</style>