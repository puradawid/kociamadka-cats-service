class Data {
    constructor(dataSource) {
        if (dataSource) {
            this._loadData = (cb) => {
                const request = new XMLHttpRequest();
                request.onreadystatechange = () => {
                  if (request.readyState === 4) {
                      console.log(request.responseText);
                      cb(JSON.parse(request.responseText).cats);
                  }
                };
                request.open('GET', dataSource);
                request.send();
            }
        } else {
            this._loadData = (cb) => {
                cb([{
                    name: 'Kicia',
                    imageUrl: 'https://kociamadka.pl/wp-content/uploads/2018/11/IMG_6177-1200x900.jpg'
                }, {
                    name: 'Franio',
                    imageUrl: 'https://kociamadka.pl/wp-content/uploads/2018/11/IMG_6177-1200x900.jpg'
                }, {
                    name: 'Amadeusz',
                    imageUrl: 'https://kociamadka.pl/wp-content/uploads/2018/11/IMG_6177-1200x900.jpg'
                }, {
                    name: 'Balbina',
                    imageUrl: 'https://kociamadka.pl/wp-content/uploads/2018/11/IMG_6177-1200x900.jpg'
                }, {
                    name: 'Kicia',
                    imageUrl: 'https://kociamadka.pl/wp-content/uploads/2018/11/IMG_6177-1200x900.jpg'
                }, {
                    name: 'Kicia',
                    imageUrl: 'https://kociamadka.pl/wp-content/uploads/2018/11/IMG_6177-1200x900.jpg'
                }, {
                    name: 'Kicia',
                    imageUrl: 'https://kociamadka.pl/wp-content/uploads/2018/11/IMG_6177-1200x900.jpg'
                }, {
                    name: 'Kicia',
                    imageUrl: 'https://kociamadka.pl/wp-content/uploads/2018/11/IMG_6177-1200x900.jpg'
                }, {
                    name: 'Kicia',
                    imageUrl: 'https://kociamadka.pl/wp-content/uploads/2018/11/IMG_6177-1200x900.jpg'
                }, {
                    name: 'Kicia',
                    imageUrl: 'https://kociamadka.pl/wp-content/uploads/2018/11/IMG_6177-1200x900.jpg'
                }, {
                    name: 'Kicia',
                    imageUrl: 'https://kociamadka.pl/wp-content/uploads/2018/11/IMG_6177-1200x900.jpg'
                }]);
            }
        }
    }

  loadData(cb) {
        this._loadData(cb);
  }


}

export default Data;
