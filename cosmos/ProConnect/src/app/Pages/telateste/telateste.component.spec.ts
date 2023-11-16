import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TelatesteComponent } from './telateste.component';

describe('TelatesteComponent', () => {
  let component: TelatesteComponent;
  let fixture: ComponentFixture<TelatesteComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TelatesteComponent]
    });
    fixture = TestBed.createComponent(TelatesteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
