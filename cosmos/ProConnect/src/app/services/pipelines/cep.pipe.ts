import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'cep'
})
export class CEPPipe implements PipeTransform {

  transform(value: string | number): string {
    //18060-015

    let formattedValue = value + '';
    if (formattedValue.length < 8 || formattedValue == '') {
      console.log(formattedValue)
      formattedValue = formattedValue.replace('-', '');
      return formattedValue;
    }
    formattedValue = formattedValue.replace('-', '');
    formattedValue = formattedValue.substring(0, 5) + '-' + formattedValue.substring(5);

    return formattedValue;
  }

}