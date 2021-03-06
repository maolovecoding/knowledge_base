import {createApp} from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'

// 集成 ant-design-vue
import Antd from "ant-design-vue";
import "ant-design-vue/dist/antd.css";
//导入所有图标库
import * as Icons from "@ant-design/icons-vue";
import axios from "axios";

axios.defaults.baseURL = process.env.VUE_APP_SERVER;

const app = createApp(App);

// 配置axios拦截器 可以打印日志等
/**
 * axios拦截器
 */
axios.interceptors.request.use(function (config) {
    console.log('请求参数：', config);
    // const token = store.state.user.token;
    // if (Tool.isNotEmpty(token)) {
    //     config.headers.token = token;
    //     console.log("请求headers增加token:", token);
    // }
    return config;
}, error => {
    return Promise.reject(error);
});
axios.interceptors.response.use(function (response) {
    console.log('返回结果：', response);
    return response;
}, error => {
    console.log('返回错误：', error);
    // const response = error.response;
    // const status = response.status;
    // if (status === 401) {
    //     // 判断状态码是401 跳转到首页或登录页
    //     console.log("未登录，跳到首页");
    //     store.commit("setUser", {});
    //     // message.error("未登录或登录超时");
    //     router.push('/');
    // }
    return Promise.reject(error);
});

// 配置axios到vue的全局变量上
app.config.globalProperties.$http = axios;
app
    .use(store)
    .use(router)
    .use(Antd)
    .mount('#app');

// 全局使用图标
const icons:any  = Icons;
for(const i in icons){
    app.component(i,icons[i]);
}

// console.log(process.env.VUE_APP_SERVER)