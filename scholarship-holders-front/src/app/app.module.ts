import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { InitialPageComponent } from './components/initial-page/initial-page.component';
import { TableComponent } from './components/table/table.component';
import { HttpClientModule } from '@angular/common/http';
import { UpdateScholarComponent } from './components/update-scholar/update-scholar.component';
import { BrowserModule } from '@angular/platform-browser';
import { AngularPrimeNgModule } from './modules/angular-primeng.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule } from '@angular/forms';
import { DynamicDialogConfig, DynamicDialogRef } from 'primeng/dynamicdialog';
import { CreateScholarComponent } from './components/create-scholar/create-scholar.component';

@NgModule({
  declarations: [
    AppComponent,
    InitialPageComponent,
    TableComponent,
    UpdateScholarComponent,
    CreateScholarComponent,
  ],
  imports: [
    BrowserModule,
    AngularPrimeNgModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    FormsModule,
  ],
  providers: [DynamicDialogConfig, DynamicDialogRef],
  bootstrap: [AppComponent],
})
export class AppModule {}
