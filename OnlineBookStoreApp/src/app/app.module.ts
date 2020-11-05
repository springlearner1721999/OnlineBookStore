import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';

import {FormsModule} from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BookListComponent } from './component/book-list/book-list.component';
import { PagenotFoundComponent } from './component/pagenot-found/pagenot-found.component';
import { BookCatagoryComponent } from './component/book-catagory/book-catagory.component';
import { SearchComponent } from './component/search/search.component';



@NgModule({
  declarations: [
    AppComponent,
    BookListComponent,
    PagenotFoundComponent,
    BookCatagoryComponent,
    SearchComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
