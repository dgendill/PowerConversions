function kwh2dollars(month) {
    // per kWh
    if (month <= 6 || month >= 10) {
        return .066;
    } else {
        return  .0722;
    }
}

function w2kw(w) {
    return w/1000;
}

function kwh2mj(kwh) {
    // mWh to megajoules
    // https://en.wikipedia.org/wiki/Kilowatt_hour
    return kwh * 3.6;
}

function j2cal(j) {
    return j * .239;
}