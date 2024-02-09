import { Pipe, PipeTransform } from '@angular/core';
import { parsePhoneNumber } from 'libphonenumber-js';

@Pipe({
  name: 'phone'
})
export class PhonePipe implements PipeTransform {

  transform(phoneValue: string | number): string {
    const stringPhone = phoneValue + ''
    if (stringPhone.length < 11 || stringPhone === '') {
      return ''
    }
    const phoneNumber = parsePhoneNumber(stringPhone, 'BR')
    const formattedPhone = phoneNumber.formatNational();
    return formattedPhone;
  }

}
