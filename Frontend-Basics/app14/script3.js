/* Sentiment Analysis */

const tweets = [
    "Excited for the new #ProductLaunch!",
    "Not sure about this #productlaunch...",
    "Can't wait to try the new product!",
    "Disappointed with the #ProductLaunch. "
];

// Remove unwanted elements like #tags
// toknize the tweets
// Split the words, make all of them lower case and combine them as strings
const cleanedTweets = tweets.map( tweet=>{
    const words = tweet.trim().split(/\s+/);

    const lowerCasedWords = words.map(word => word.toLocaleLowerCase());

    const filteredWords = lowerCasedWords.filter(word=> !word.startsWith('#'));

    return filteredWords.join(' ');

});

console.log(`Original Tweets: ${tweets}`);
console.log(`Cleaned Tweets: ${cleanedTweets}`);

