import { createRouter, createWebHistory } from 'vue-router'
import PublicHome from '../views/public_system/home.vue'
import PublicService from '../views/public_system/service.vue'
import PublicAbout from '../views/public_system/about_us.vue'
import PublicContact from '../views/public_system/contact.vue'
import Welcome from '../views/login&register_system/welcome.vue'
import CustomerLogin from '../views/login&register_system/customer_login.vue'
import CustomerRegister from '../views/login&register_system/customer_register.vue'
import RoleSelection from '../views/login&register_system/role_selection.vue'
import StaffRole from '../views/login&register_system/staff_role.vue'
import TechnicalStaffLogin from '../views/login&register_system/technical_staff_login.vue'
import ServiceStaffLogin from '../views/login&register_system/service_staff_login.vue'
import AnalystStaffLogin from '../views/login&register_system/analyst_staff_login.vue'
import TechnicalStaffRegister from '../views/login&register_system/technical_staff_register.vue'
import ServiceStaffRegister from '../views/login&register_system/service_staff_register.vue'
import AnalystStaffRegister from '../views/login&register_system/analyst_staff_register.vue'
import CustomerAccount from '../views/customer_system/customer_account.vue'
import CustomerEdit from '../views/customer_system/edit.vue'
import LinkBankCard from '../views/customer_system/link_bank_card.vue'
import Book from '../views/book_system/book.vue'
import BookCategories from '../views/book_system/book_categories.vue'
import BookOrder from '../views/book_system/book_order.vue'

const routes = [
  { path: '/', redirect: '/public/home' },
  { path: '/public/home', component: PublicHome },
  { path: '/public/service', component: PublicService },
  { path: '/public/about-us', component: PublicAbout },
  { path: '/public/contact', component: PublicContact },
  { path: '/auth/welcome', component: Welcome },
  { path: '/auth/customer-login', component: CustomerLogin },
  { path: '/auth/customer-register', component: CustomerRegister },
  { path: '/auth/role-selection', component: RoleSelection },
  { path: '/auth/staff-role', component: StaffRole },
  { path: '/auth/technical-staff-login', component: TechnicalStaffLogin },
  { path: '/auth/service-staff-login', component: ServiceStaffLogin },
  { path: '/auth/analyst-staff-login', component: AnalystStaffLogin },
  { path: '/auth/technical-staff-register', component: TechnicalStaffRegister },
  { path: '/auth/service-staff-register', component: ServiceStaffRegister },
  { path: '/auth/analyst-staff-register', component: AnalystStaffRegister },
  { path: '/books', component: Book },
  { path: '/books/categories', component: BookCategories },
  { path: '/books/order', component: BookOrder },
  { path: '/customer/account', component: CustomerAccount },
  { path: '/customer/edit', component: CustomerEdit },
  { path: '/customer/link-bank-card', component: LinkBankCard }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
