import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

// import {MaterialExampleModule} from '../material.module';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatSliderModule } from '@angular/material/slider';
import { DragdropComponent } from './dragdrop/dragdrop.component';

import {MatNativeDateModule} from '@angular/material/core';
import {DragDropModule} from '@angular/cdk/drag-drop';
import { DragComponent } from './drag/drag.component';
import { MaterialExampleModule } from 'src/material.module';

@NgModule({
  declarations: [
    AppComponent,
    DragdropComponent,
    DragComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatSliderModule,
    BrowserAnimationsModule,
    MatNativeDateModule,
    FormsModule,
    HttpClientModule,
    MaterialExampleModule,
    ReactiveFormsModule,
  ],
  providers: [DragDropModule],
  bootstrap: [AppComponent]
})
export class AppModule { }
