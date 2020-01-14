
package by.man.bot.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Datum {

    @SerializedName("rh")
    @Expose
    private Integer rh;
    @SerializedName("pod")
    @Expose
    private String pod;
    @SerializedName("lon")
    @Expose
    private Double lon;
    @SerializedName("pres")
    @Expose
    private Double pres;
    @SerializedName("timezone")
    @Expose
    private String timezone;
    @SerializedName("ob_time")
    @Expose
    private String obTime;
    @SerializedName("country_code")
    @Expose
    private String countryCode;
    @SerializedName("clouds")
    @Expose
    private Float clouds;
    @SerializedName("ts")
    @Expose
    private Float ts;
    @SerializedName("solar_rad")
    @Expose
    private Float solarRad;
    @SerializedName("state_code")
    @Expose
    private String stateCode;
    @SerializedName("city_name")
    @Expose
    private String cityName;
    @SerializedName("wind_spd")
    @Expose
    private Double windSpd;
    @SerializedName("last_ob_time")
    @Expose
    private String lastObTime;
    @SerializedName("wind_cdir_full")
    @Expose
    private String windCdirFull;
    @SerializedName("wind_cdir")
    @Expose
    private String windCdir;
    @SerializedName("slp")
    @Expose
    private Double slp;
    @SerializedName("vis")
    @Expose
    private Double vis;
    @SerializedName("h_angle")
    @Expose
    private Float hAngle;
    @SerializedName("sunset")
    @Expose
    private String sunset;
    @SerializedName("dni")
    @Expose
    private Float dni;
    @SerializedName("dewpt")
    @Expose
    private Double dewpt;
    @SerializedName("snow")
    @Expose
    private Float snow;
    @SerializedName("uv")
    @Expose
    private Float uv;
    @SerializedName("precip")
    @Expose
    private Float precip;
    @SerializedName("wind_dir")
    @Expose
    private Float windDir;
    @SerializedName("sunrise")
    @Expose
    private String sunrise;
    @SerializedName("ghi")
    @Expose
    private Float ghi;
    @SerializedName("dhi")
    @Expose
    private Float dhi;
    @SerializedName("aqi")
    @Expose
    private Float aqi;
    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("weather")
    @Expose
    private Weather weather;
    @SerializedName("datetime")
    @Expose
    private String datetime;
    @SerializedName("temp")
    @Expose
    private Double temp;
    @SerializedName("station")
    @Expose
    private String station;
    @SerializedName("elev_angle")
    @Expose
    private Double elevAngle;
    @SerializedName("app_temp")
    @Expose
    private Double appTemp;

    public Integer getRh() {
        return rh;
    }

    public void setRh(Integer rh) {
        this.rh = rh;
    }

    public String getPod() {
        return pod;
    }

    public void setPod(String pod) {
        this.pod = pod;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getPres() {
        return pres;
    }

    public void setPres(Double pres) {
        this.pres = pres;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getObTime() {
        return obTime;
    }

    public void setObTime(String obTime) {
        this.obTime = obTime;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Float getClouds() {
        return clouds;
    }

    public void setClouds(Float clouds) {
        this.clouds = clouds;
    }

    public Float getTs() {
        return ts;
    }

    public void setTs(Float ts) {
        this.ts = ts;
    }

    public Float getSolarRad() {
        return solarRad;
    }

    public void setSolarRad(Float solarRad) {
        this.solarRad = solarRad;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Double getWindSpd() {
        return windSpd;
    }

    public void setWindSpd(Double windSpd) {
        this.windSpd = windSpd;
    }

    public String getLastObTime() {
        return lastObTime;
    }

    public void setLastObTime(String lastObTime) {
        this.lastObTime = lastObTime;
    }

    public String getWindCdirFull() {
        return windCdirFull;
    }

    public void setWindCdirFull(String windCdirFull) {
        this.windCdirFull = windCdirFull;
    }

    public String getWindCdir() {
        return windCdir;
    }

    public void setWindCdir(String windCdir) {
        this.windCdir = windCdir;
    }

    public Double getSlp() {
        return slp;
    }

    public void setSlp(Double slp) {
        this.slp = slp;
    }

    public Double getVis() {
        return vis;
    }

    public void setVis(Double vis) {
        this.vis = vis;
    }

    public Float getHAngle() {
        return hAngle;
    }

    public void setHAngle(Float hAngle) {
        this.hAngle = hAngle;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public Float getDni() {
        return dni;
    }

    public void setDni(Float dni) {
        this.dni = dni;
    }

    public Double getDewpt() {
        return dewpt;
    }

    public void setDewpt(Double dewpt) {
        this.dewpt = dewpt;
    }

    public Float getSnow() {
        return snow;
    }

    public void setSnow(Float snow) {
        this.snow = snow;
    }

    public Float getUv() {
        return uv;
    }

    public void setUv(Float uv) {
        this.uv = uv;
    }

    public Float getPrecip() {
        return precip;
    }

    public void setPrecip(Float precip) {
        this.precip = precip;
    }

    public Float getWindDir() {
        return windDir;
    }

    public void setWindDir(Float windDir) {
        this.windDir = windDir;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public Float getGhi() {
        return ghi;
    }

    public void setGhi(Float ghi) {
        this.ghi = ghi;
    }

    public Float getDhi() {
        return dhi;
    }

    public void setDhi(Float dhi) {
        this.dhi = dhi;
    }

    public Float getAqi() {
        return aqi;
    }

    public void setAqi(Float aqi) {
        this.aqi = aqi;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public Double getElevAngle() {
        return elevAngle;
    }

    public void setElevAngle(Double elevAngle) {
        this.elevAngle = elevAngle;
    }

    public Double getAppTemp() {
        return appTemp;
    }

    public void setAppTemp(Double appTemp) {
        this.appTemp = appTemp;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("rh", rh).append("pod", pod).append("lon", lon).append("pres", pres).append("timezone", timezone).append("obTime", obTime).append("countryCode", countryCode).append("clouds", clouds).append("ts", ts).append("solarRad", solarRad).append("stateCode", stateCode).append("cityName", cityName).append("windSpd", windSpd).append("lastObTime", lastObTime).append("windCdirFull", windCdirFull).append("windCdir", windCdir).append("slp", slp).append("vis", vis).append("hAngle", hAngle).append("sunset", sunset).append("dni", dni).append("dewpt", dewpt).append("snow", snow).append("uv", uv).append("precip", precip).append("windDir", windDir).append("sunrise", sunrise).append("ghi", ghi).append("dhi", dhi).append("aqi", aqi).append("lat", lat).append("weather", weather).append("datetime", datetime).append("temp", temp).append("station", station).append("elevAngle", elevAngle).append("appTemp", appTemp).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(windCdir).append(sunrise).append(pod).append(pres).append(timezone).append(solarRad).append(lastObTime).append(lon).append(clouds).append(windDir).append(windSpd).append(datetime).append(precip).append(cityName).append(countryCode).append(weather).append(station).append(dni).append(lat).append(vis).append(uv).append(temp).append(dhi).append(ghi).append(dewpt).append(elevAngle).append(hAngle).append(rh).append(obTime).append(slp).append(snow).append(sunset).append(aqi).append(appTemp).append(stateCode).append(windCdirFull).append(ts).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Datum) == false) {
            return false;
        }
        Datum rhs = ((Datum) other);
        return new EqualsBuilder().append(windCdir, rhs.windCdir).append(sunrise, rhs.sunrise).append(pod, rhs.pod).append(pres, rhs.pres).append(timezone, rhs.timezone).append(solarRad, rhs.solarRad).append(lastObTime, rhs.lastObTime).append(lon, rhs.lon).append(clouds, rhs.clouds).append(windDir, rhs.windDir).append(windSpd, rhs.windSpd).append(datetime, rhs.datetime).append(precip, rhs.precip).append(cityName, rhs.cityName).append(countryCode, rhs.countryCode).append(weather, rhs.weather).append(station, rhs.station).append(dni, rhs.dni).append(lat, rhs.lat).append(vis, rhs.vis).append(uv, rhs.uv).append(temp, rhs.temp).append(dhi, rhs.dhi).append(ghi, rhs.ghi).append(dewpt, rhs.dewpt).append(elevAngle, rhs.elevAngle).append(hAngle, rhs.hAngle).append(rh, rhs.rh).append(obTime, rhs.obTime).append(slp, rhs.slp).append(snow, rhs.snow).append(sunset, rhs.sunset).append(aqi, rhs.aqi).append(appTemp, rhs.appTemp).append(stateCode, rhs.stateCode).append(windCdirFull, rhs.windCdirFull).append(ts, rhs.ts).isEquals();
    }

}
