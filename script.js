const options = {
	method: 'GET',
	headers: {
		'X-RapidAPI-Key': '792181fd0bmsh33a53baeba7e3eap1bd716jsnd3ed17a4d0d2',
		'X-RapidAPI-Host': 'foreca-weather.p.rapidapi.com'
	}
};

fetch('https://foreca-weather.p.rapidapi.com/location/search/mumbai?lang=en&country=in', options)
	.then(response => response.json())
	.then(response => console.log(response))
	.catch(err => console.error(err));