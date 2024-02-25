import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import zulindanche from '@/views/modules/zulindanche/list'
    import tingchedian from '@/views/modules/tingchedian/list'
    import caozuoyuan from '@/views/modules/caozuoyuan/list'
    import discussgongxiangdanche from '@/views/modules/discussgongxiangdanche/list'
    import yonghuchongzhi from '@/views/modules/yonghuchongzhi/list'
    import weixiuxinxi from '@/views/modules/weixiuxinxi/list'
    import storeup from '@/views/modules/storeup/list'
    import cheliangleixing from '@/views/modules/cheliangleixing/list'
    import yonghu from '@/views/modules/yonghu/list'
    import chat from '@/views/modules/chat/list'
    import xitongjianjie from '@/views/modules/xitongjianjie/list'
    import messages from '@/views/modules/messages/list'
    import zhanneixinwen from '@/views/modules/zhanneixinwen/list'
    import gongxiangdanche from '@/views/modules/gongxiangdanche/list'
    import config from '@/views/modules/config/list'
    import guihaidanche from '@/views/modules/guihaidanche/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/zulindanche',
        name: '租赁单车',
        component: zulindanche
      }
      ,{
	path: '/tingchedian',
        name: '停车点',
        component: tingchedian
      }
      ,{
	path: '/caozuoyuan',
        name: '操作员',
        component: caozuoyuan
      }
      ,{
	path: '/discussgongxiangdanche',
        name: '共享单车评论',
        component: discussgongxiangdanche
      }
      ,{
	path: '/yonghuchongzhi',
        name: '用户充值',
        component: yonghuchongzhi
      }
      ,{
	path: '/weixiuxinxi',
        name: '维修信息',
        component: weixiuxinxi
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/cheliangleixing',
        name: '车辆类型',
        component: cheliangleixing
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/chat',
        name: '在线客服',
        component: chat
      }
      ,{
	path: '/xitongjianjie',
        name: '系统简介',
        component: xitongjianjie
      }
      ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
      ,{
	path: '/zhanneixinwen',
        name: '站内新闻',
        component: zhanneixinwen
      }
      ,{
	path: '/gongxiangdanche',
        name: '共享单车',
        component: gongxiangdanche
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/guihaidanche',
        name: '归还单车',
        component: guihaidanche
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
