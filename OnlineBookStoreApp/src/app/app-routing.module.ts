import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BookListComponent } from './component/book-list/book-list.component';
import { PagenotFoundComponent } from './component/pagenot-found/pagenot-found.component';


const routes: Routes = [
      {path: 'Home',component: BookListComponent},
      {path: 'catagory/:id',component: BookListComponent},
      {path: 'search/:keyword',component: BookListComponent},
      {path: '', pathMatch: 'full', redirectTo: '/Home'},
      {path: '**',component: PagenotFoundComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
