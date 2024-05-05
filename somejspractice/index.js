if (navigator.clipboard) {
     // Reading from the clipboard
     navigator.clipboard.readText().then(text => {
         console.log('Text from clipboard:', text);
     }).catch(err => {
         console.error('Failed to read from clipboard:', err);
     });
 
     // Writing to the clipboard
     const textToCopy = "Hello, clipboard!";
     navigator.clipboard.writeText(textToCopy).then(() => {
         console.log('Text copied to clipboard successfully:', textToCopy);
     }).catch(err => {
         console.error('Failed to write to clipboard:', err);
     });
 } else {
     console.error('Clipboard API is not supported in this browser.');
 }
 let a=10;
 let b=100;
 let sum=a+b;
 console.log(sum);
 








