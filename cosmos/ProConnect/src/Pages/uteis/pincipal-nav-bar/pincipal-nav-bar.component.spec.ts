import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PincipalNavBarComponent } from './pincipal-nav-bar.component';

describe('PincipalNavBarComponent', () => {
  let component: PincipalNavBarComponent;
  let fixture: ComponentFixture<PincipalNavBarComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PincipalNavBarComponent]
    });
    fixture = TestBed.createComponent(PincipalNavBarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
