/* @type {import{'tailwindcss'}.Config} */
 
const { default: daisyui } = require("daisyui");
 
module.export = {
    content: ["./app/*.{js,jsx}"],
    theme: { extend:{}},
    plugins: [require("daisyui")],
    daisyui: { themes: ["light","dark"]},
}