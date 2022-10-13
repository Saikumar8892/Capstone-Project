import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddUserCarComponent } from './add-user-car.component';

describe('AddUserCarComponent', () => {
  let component: AddUserCarComponent;
  let fixture: ComponentFixture<AddUserCarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddUserCarComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddUserCarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
