import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'money'
})
export class MoneyPipe implements PipeTransform {

  transform(value: number|string): string {

    let money = 'R$ '
    let valueTransformed = value.toString();
    if (valueTransformed.length >= 3){
      valueTransformed = valueTransformed.substring(0,2) + ',' + valueTransformed.substring(3);
      return money + valueTransformed;
    }
    return money + valueTransformed;
  }

}
