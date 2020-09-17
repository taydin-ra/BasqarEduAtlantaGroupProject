package PojoFiles.Schools;

public class TranslateName {

    private String lang;
    private boolean defaultLang;
    private String data;

    @Override
    public String toString() {
        return "TranslateName{" +
                "lang='" + lang + '\'' +
                ", defaultLang=" + defaultLang +
                ", data='" + data + '\'' +
                '}';
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public boolean getDefaultLang() {
        return defaultLang;
    }

    public void setDefaultLang(boolean defaultLang) {
        this.defaultLang = defaultLang;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
