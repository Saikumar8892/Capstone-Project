import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminCarRetrieveComponent } from './admin-car-retrieve.component';

describe('AdminCarRetrieveComponent', () => {
  let component: AdminCarRetrieveComponent;
  let fixture: ComponentFixture<AdminCarRetrieveComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminCarRetrieveComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminCarRetrieveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
