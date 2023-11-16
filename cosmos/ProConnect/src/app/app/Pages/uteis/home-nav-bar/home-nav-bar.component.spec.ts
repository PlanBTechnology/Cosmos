import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HomeNavBarComponent } from './home-nav-bar.component';

describe('HomeNavBarComponent', () => {
  let component: HomeNavBarComponent;
  let fixture: ComponentFixture<HomeNavBarComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [HomeNavBarComponent]
    });
    fixture = TestBed.createComponent(HomeNavBarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
