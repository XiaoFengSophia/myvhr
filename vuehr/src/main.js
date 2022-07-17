import Vue from 'vue';
import App from './App.vue';
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import router from './router';
import store from './store';
import {postKeyValueRequest} from "@/utils/api";
import {postRequest} from "@/utils/api";
import {putRequest} from "@/utils/api";
import {deleteRequest} from "@/utils/api";
import {getRequest} from "@/utils/api";
import {initMenu} from "@/utils/menu";
import 'font-awesome/css/font-awesome.min.css';

Vue.prototype.postKeyValueRequest = postKeyValueRequest;
Vue.prototype.postRequest = postRequest;
Vue.prototype.putRequest = putRequest;
Vue.prototype.deleteRequest = deleteRequest;
Vue.prototype.getRequest = getRequest;

Vue.config.productionTip = false

Vue.use(ElementUI);
// 路由导航守卫，to:去哪儿  from:从哪来   next:类似于后端的过滤链
router.beforeEach((to, from, next) => {
    if(to.path == '/'){
        next();
    }else{
        initMenu(router, store);
        next();
    }
    next();
})

new Vue({
    router,
    store,
    render: h => h(App)
}).$mount('#app')
