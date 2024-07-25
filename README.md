<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE jasperReport PUBLIC "-//JasperReports//DTD Report Design//EN"
        "http://jasperreports.sourceforge.net/dtds/jasperreport.dtd">
<jasperReport xmlns="http://jasperreports.sourceforge.net/jasperreports" 
              xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
              xsi:schemaLocation="http://jasperreports.sourceforge.net/jasperreports 
                                  http://jasperreports.sourceforge.net/xsd/jasperreport.xsd" 
              name="PartAdmissionAffidavit" 
              pageWidth="595" 
              pageHeight="842" 
              columnWidth="555" 
              leftMargin="20" 
              rightMargin="20" 
              topMargin="20" 
              bottomMargin="20" 
              uuid="12345678-1234-1234-1234-123456789012">

    <parameter name="ContactName" class="java.lang.String"/>
    <parameter name="Date" class="java.lang.String"/>
    <parameter name="InstitutionName" class="java.lang.String"/>
    <parameter name="ContactEmail" class="java.lang.String"/>
    <parameter name="TransactionAmount" class="java.lang.String"/>
    <parameter name="TransactionDate" class="java.lang.String"/>
    <parameter name="MerchantName" class="java.lang.String"/>
    <parameter name="ARNData" class="java.lang.String"/>
    <parameter name="AffiantName" class="java.lang.String"/>
    <parameter name="NotaryDate" class="java.lang.String"/>
    <parameter name="State" class="java.lang.String"/>
    <parameter name="County" class="java.lang.String"/>
    <parameter name="Identification" class="java.lang.String"/>

    <detail>
        <band height="600" splitType="Stretch">
            <staticText>
                <reportElement x="0" y="0" width="555" height="20" uuid="static-0"/>
                <textElement/>
                <text><![CDATA[Part Admission Affidavit]]></text>
            </staticText>

            <staticText>
                <reportElement x="0" y="30" width="555" height="15" uuid="static-1"/>
                <textElement/>
                <text><![CDATA[Page 1 to be completed by the institution and sent to the cardholder.]]></text>
            </staticText>

            <staticText>
                <reportElement x="0" y="50" width="555" height="15" uuid="static-2"/>
                <textElement/>
                <text><![CDATA[Filing information:]]></text>
            </staticText>

            <staticText>
                <reportElement x="0" y="70" width="200" height="15" uuid="static-3"/>
                <textElement/>
                <text><![CDATA[Contact Name:]]></text>
            </staticText>
            <textField>
                <reportElement x="200" y="70" width="355" height="15" uuid="dynamic-1"/>
                <textElement/>
                <textFieldExpression><![CDATA[$P{ContactName}]]></textFieldExpression>
            </textField>

            <staticText>
                <reportElement x="0" y="90" width="200" height="15" uuid="static-4"/>
                <textElement/>
                <text><![CDATA[Date:]]></text>
            </staticText>
            <textField>
                <reportElement x="200" y="90" width="355" height="15" uuid="dynamic-2"/>
                <textElement/>
                <textFieldExpression><![CDATA[$P{Date}]]></textFieldExpression>
            </textField>

            <staticText>
                <reportElement x="0" y="110" width="200" height="15" uuid="static-5"/>
                <textElement/>
                <text><![CDATA[Institution Name:]]></text>
            </staticText>
            <textField>
                <reportElement x="200" y="110" width="355" height="15" uuid="dynamic-3"/>
                <textElement/>
                <textFieldExpression><![CDATA[$P{InstitutionName}]]></textFieldExpression>
            </textField>

            <staticText>
                <reportElement x="0" y="130" width="200" height="15" uuid="static-6"/>
                <textElement/>
                <text><![CDATA[Contact Email:]]></text>
            </staticText>
            <textField>
                <reportElement x="200" y="130" width="355" height="15" uuid="dynamic-4"/>
                <textElement/>
                <textFieldExpression><![CDATA[$P{ContactEmail}]]></textFieldExpression>
            </textField>

            <staticText>
                <reportElement x="0" y="150" width="200" height="15" uuid="static-7"/>
                <textElement/>
                <text><![CDATA[Transaction Amount:]]></text>
            </staticText>
            <textField>
                <reportElement x="200" y="150" width="355" height="15" uuid="dynamic-5"/>
                <textElement/>
                <textFieldExpression><![CDATA[$P{TransactionAmount}]]></textFieldExpression>
            </textField>

            <staticText>
                <reportElement x="0" y="170" width="200" height="15" uuid="static-8"/>
                <textElement/>
                <text><![CDATA[Transaction Date:]]></text>
            </staticText>
            <textField>
                <reportElement x="200" y="170" width="355" height="15" uuid="dynamic-6"/>
                <textElement/>
                <textFieldExpression><![CDATA[$P{TransactionDate}]]></textFieldExpression>
            </textField>

            <staticText>
                <reportElement x="0" y="190" width="200" height="15" uuid="static-9"/>
                <textElement/>
                <text><![CDATA[Merchant Name:]]></text>
            </staticText>
            <textField>
                <reportElement x="200" y="190" width="355" height="15" uuid="dynamic-7"/>
                <textElement/>
                <textFieldExpression><![CDATA[$P{MerchantName}]]></textFieldExpression>
            </textField>

            <staticText>
                <reportElement x="0" y="210" width="200" height="15" uuid="static-10"/>
                <textElement/>
                <text><![CDATA[ARN Data:]]></text>
            </staticText>
            <textField>
                <reportElement x="200" y="210" width="355" height="15" uuid="dynamic-8"/>
                <textElement/>
                <textFieldExpression><![CDATA[$P{ARNData}]]></textFieldExpression>
            </textField>

            <staticText>
                <reportElement x="0" y="250" width="555" height="20" uuid="static-11"/>
                <textElement/>
                <text><![CDATA[Part Admission Affidavit]]></text>
            </staticText>

            <staticText>
                <reportElement x="0" y="270" width="555" height="15" uuid="static-12"/>
                <textElement/>
                <text><![CDATA[Page 2 to be completed and signed by the cardholder before the notary public.]]></text>
            </staticText>

            <staticText>
                <reportElement x="0" y="290" width="555" height="15" uuid="static-13"/>
                <textElement/>
                <text><![CDATA[I,]]></text>
            </staticText>
            <textField>
                <reportElement x="10" y="290" width="355" height="15" uuid="dynamic-9"/>
                <textElement/>
                <textFieldExpression><![CDATA[$P{AffiantName}]]></textFieldExpression>
            </textField>
            <staticText>
                <reportElement x="370" y="290" width="185" height="15" uuid="static-14"/>
                <textElement/>
                <text><![CDATA[, hereby attest that I did not authorize the]]></text>
            </staticText>

            <staticText>
                <reportElement x="0" y="310" width="555" height="15" uuid="static-15"/>
                <textElement/>
                <text><![CDATA[transaction dated]]></text>
            </staticText>
            <textField>
                <reportElement x="100" y="310" width="100" height="15" uuid="dynamic-10"/>
                <textElement/>
                <textFieldExpression><![CDATA[$P{TransactionDate}]]></textFieldExpression>
            </textField>
            <staticText>
                <reportElement x="200" y="310" width="355" height="15" uuid="static-16"/>
                <textElement/>
                <text><![CDATA[for]]></text>
            </staticText>
            <textField>
                <reportElement x="220" y="310" width="100" height="15" uuid="dynamic-11"/>
                <textElement/>
                <textFieldExpression><![CDATA[$P{TransactionAmount}]]></textFieldExpression>
            </textField>
            <staticText>
                <reportElement x="320" y="310" width="355" height="15" uuid="static-17"/>
                <textElement/>
                <text><![CDATA[with]]></text>
            </staticText>
            <textField>
                <reportElement x="340" y="310" width="200" height="15" uuid="dynamic-12"/>
                <textElement/>
                <textFieldExpression><![CDATA[$P{MerchantName}]]></textFieldExpression>
            </textField>

            <staticText>
                <reportElement x="0" y="330" width="555" height="15" uuid="static-18"/>
                <textElement/>
                <text><![CDATA[This transaction does not align with my financial activities, and I declare it to be unauthorized.]]></text>
            </staticText>

            <staticText>
                <reportElement x="0" y="350" width="200" height="15" uuid="static-19"/>
                <textElement/>
                <text><![CDATA[Affiant/Cardholder Signature:]]></text>
            </staticText>
            <staticText>
                <reportElement x="200" y="350" width="355" height="15" uuid="static-20"/>
                <textElement/>
                <text><![CDATA[----------------------------------------------]]></text>
            </staticText>

            <staticText>
                <reportElement x="0" y="370" width="200" height="15" uuid="static-21"/>
                <textElement/>
                <text><![CDATA[Affiant/Cardholder Name:]]></text>
            </staticText>
            <textField>
                <reportElement x="200" y="370" width="355" height="15" uuid="dynamic-13"/>
                <textElement/>
                <textFieldExpression><![CDATA[$P{AffiantName}]]></textFieldExpression>
            </textField>

            <staticText>
                <reportElement x="0" y="390" width="200" height="15" uuid="static-22"/>
                <textElement/>
                <text><![CDATA[Date:]]></text>
            </staticText>
            <textField>
                <reportElement x="200" y="390" width="355" height="15" uuid="dynamic-14"/>
                <textElement/>
                <textFieldExpression><![CDATA[$P{NotaryDate}]]></textFieldExpression>
            </textField>

            <staticText>
                <reportElement x="0" y="410" width="200" height="15" uuid="static-23"/>
                <textElement/>
                <text><![CDATA[State of:]]></text>
            </staticText>
            <textField>
                <reportElement x="200" y="410" width="355" height="15" uuid="dynamic-15"/>
                <textElement/>
                <textFieldExpression><![CDATA[$P{State}]]></textFieldExpression>
            </textField>

            <staticText>
                <reportElement x="0" y="430" width="200" height="15" uuid="static-24"/>
                <textElement/>
                <text><![CDATA[County of:]]></text>
            </staticText>
            <textField>
                <reportElement x="200" y="430" width="355" height="15" uuid="dynamic-16"/>
                <textElement/>
                <textFieldExpression><![CDATA[$P{County}]]></textFieldExpression>
            </textField>

            <staticText>
                <reportElement x="0" y="450" width="555" height="15" uuid="static-25"/>
                <textElement/>
                <text><![CDATA[Sworn and subscribed before me, the undersigned authority, on the]]></text>
            </staticText>
            <textField>
                <reportElement x="400" y="450" width="100" height="15" uuid="dynamic-17"/>
                <textElement/>
                <textFieldExpression><![CDATA[$P{NotaryDate}]]></textFieldExpression>
            </textField>
            <staticText>
                <reportElement x="500" y="450" width="100" height="15" uuid="static-26"/>
                <textElement/>
                <text><![CDATA[, by]]></text>
            </staticText>

            <textField>
                <reportElement x="0" y="470" width="355" height="15" uuid="dynamic-18"/>
                <textElement/>
                <textFieldExpression><![CDATA[$P{AffiantName}]]></textFieldExpression>
            </textField>

            <staticText>
                <reportElement x="0" y="490" width="555" height="15" uuid="static-27"/>
                <textElement/>
                <text><![CDATA[who is personally known to me or produced the following identification:]]></text>
            </staticText>
            <textField>
                <reportElement x="0" y="510" width="355" height="15" uuid="dynamic-19"/>
                <textElement/>
                <textFieldExpression><![CDATA[$P{Identification}]]></textFieldExpression>
            </textField>

            <staticText>
                <reportElement x="0" y="530" width="200" height="15" uuid="static-28"/>
                <textElement/>
                <text><![CDATA[Notary public:]]></text>
            </staticText>
            <staticText>
                <reportElement x="200" y="530" width="355" height="15" uuid="static-29"/>
                <textElement/>
                <text><![CDATA[----------------------------------------------]]></text>
            </staticText>

            <staticText>
                <reportElement x="0" y="550" width="200" height="15" uuid="static-30"/>
                <textElement/>
                <text><![CDATA[My commission expires:]]></text>
            </staticText>
            <staticText>
                <reportElement x="200" y="550" width="355" height="15" uuid="static-31"/>
                <textElement/>
                <text><![CDATA[----------------------------------------------]]></text>
            </staticText>
        </band>
    </detail>
</jasperReport>
