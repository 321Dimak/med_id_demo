import java.util.Objects;

class Medicine {

    private final String product_id;
    private final String original_name;
    private final String legal_status;
    private final String strength;
    private final String pharmaceutical_form;
    private final String active_substance;
    private final String manufacturer;
    private final String atc_code;
    private final String product_price_without_vat_eur;

    public Medicine(String product_id, String original_name, String legal_status, String strength, String pharmaceutical_form, String active_substance, String manufacturer, String atc_code, String product_price_without_vat_eur) {
        this.product_id = product_id;
        this.original_name = original_name;
        this.legal_status = legal_status;
        this.strength = strength;
        this.pharmaceutical_form = pharmaceutical_form;
        this.active_substance = active_substance;
        this.manufacturer = manufacturer;
        this.atc_code = atc_code;
        this.product_price_without_vat_eur = product_price_without_vat_eur;
    }

    public String getProduct_id() {
        return product_id;
    }

    public String getOriginal_name() {
        return original_name;
    }

    public String getLegal_status() {
        return legal_status;
    }

    public String getStrength() {
        return strength;
    }

    public String getPharmaceutical_form() {
        return pharmaceutical_form;
    }

    public String getActive_substance() {
        return active_substance;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getAtc_code() {
        return atc_code;
    }

    public String getProduct_price_without_vat_eur() {
        return product_price_without_vat_eur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medicine medicine = (Medicine) o;
        return Objects.equals(product_id, medicine.product_id) && Objects.equals(original_name, medicine.original_name) && Objects.equals(legal_status, medicine.legal_status) && Objects.equals(strength, medicine.strength) && Objects.equals(pharmaceutical_form, medicine.pharmaceutical_form) && Objects.equals(active_substance, medicine.active_substance) && Objects.equals(manufacturer, medicine.manufacturer) && atc_code.equals(medicine.atc_code) && Objects.equals(product_price_without_vat_eur, medicine.product_price_without_vat_eur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product_id, original_name, legal_status, strength, pharmaceutical_form, active_substance, manufacturer, atc_code, product_price_without_vat_eur);
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "product_id='" + product_id + '\'' +
                ", original_name='" + original_name + '\'' +
                ", legal_status='" + legal_status + '\'' +
                ", strength='" + strength + '\'' +
                ", pharmaceutical_form='" + pharmaceutical_form + '\'' +
                ", active_substance='" + active_substance + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", atc_code='" + atc_code + '\'' +
                ", product_price_without_vat_eur='" + product_price_without_vat_eur + '\'' +
                '}';
    }
}
