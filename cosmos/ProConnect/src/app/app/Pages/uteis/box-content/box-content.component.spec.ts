import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BoxContentComponent } from './box-content.component';

describe('BoxContentComponent', () => {
  let component: BoxContentComponent;
  let fixture: ComponentFixture<BoxContentComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [BoxContentComponent]
    });
    fixture = TestBed.createComponent(BoxContentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
