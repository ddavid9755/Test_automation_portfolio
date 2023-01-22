package helper;

public class PageEnums {

    public enum PageNames {
        ABTESTING("A/B Testing"),
        ADDREMOVE("Add/Remove Elements"),
        BASICAUTH("Basic Auth"),
        BROKENIMAGES("Broken Images"),
        CHALLENGINGDOM("Challenging DOM"),
        CHECKBOXES("Checkboxes"),
        CONTEXTMENU("Context Menu"),
        DIGESTAUTH("Digest Authentication"),
        DISAPPEARINGELEMENTS("Disappearing Elements"),
        DND("Drag and Drop"),
        DROPDOWN("Dropdown"),
        DYNAMICCONTENT("Dynamic Content"),
        DYNAMICLOADING("Dynamic Loading"),
        ENTRYAD("Entry Ad"),
        EXITINTENT("Exit Intent"),
        FILEDOWNLOAD("File Download"),
        FILEUPLOAD("File Upload"),
        FLOATINGMENU("Floating Menu"),
        FORGOTPASSWORD("Forgot Password"),
        FORMAUTH("Form Authentication"),
        FRAMES("Frames"),
        GEOLOC("Geolocation"),
        HORIZONTALSLIDER("Horizontal Slider"),
        HOVERS("Hovers"),
        INFINITESCROLL("Infinite Scroll"),
        INPUTS("Inputs"),
        JQUERYUI("JQuery UI Menus"),
        JAVASCRIPTALERT("JavaScript Alerts"),
        JAVASCRIPTONLOADEVENTERROR("Javascript onload event error"),
        KEYPRESSES("Key Presses"),
        LARGEANDDEEPDOM("Large & Deep DOM"),
        MULTIPLEWINDOWS("Multiple Windows"),
        NESTEDFRAMES("Nested Frames"),
        NOTIFICATIONMESSAGES("Notification Messages"),
        REDIRECTLINK("Redirect Link"),
        SECUREFILEDOWNLOAD("Secure File Download"),
        SHADOWDOM("Shadow DOM"),
        SHIFTINGCONTENT("Shifting Content"),
        SLOWRESOURCES("Slow Resources"),
        SORTABLEDATATABLE("Sortable Data Tables"),
        STATUSCODE("Status Code"),
        TYPOS("Typos"),
        WYSIWYGEDITOR("WYSIWYG Editor");
        public final String name;
        PageNames(String name) { this.name = name; }
    }
}
