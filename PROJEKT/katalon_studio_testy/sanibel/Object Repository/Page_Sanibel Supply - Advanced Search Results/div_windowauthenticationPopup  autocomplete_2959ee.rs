<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_windowauthenticationPopup  autocomplete_2959ee</name>
   <tag></tag>
   <elementGuidId>14b3eca4-452b-41da-89f4-eecb26686b9e</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//main[@id='maincontent']/div[3]</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>columns</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value> 
        window.authenticationPopup = {&quot;autocomplete&quot;:&quot;off&quot;,&quot;customerRegisterUrl&quot;:&quot;https:\/\/www.sanibelsupply.eu\/customer\/account\/create\/&quot;,&quot;customerForgotPasswordUrl&quot;:&quot;https:\/\/www.sanibelsupply.eu\/customer\/account\/forgotpassword\/&quot;,&quot;baseUrl&quot;:&quot;https:\/\/www.sanibelsupply.eu\/&quot;};


            9 items were found using the following search criteria      Product Name: ambu     Don't see what you're looking for? Modify your search.             Sort By  Product Name Price  Set Descending Direction         View as   Grid    List        9 Items            Show  16 32 80 Allper page              Ambu® 0415M tab electrode, bag/100 pcs (10x10 pcs)          €8.94               Add to Cart               Ambu® 2300 Blue Sensor Tab Electrode, box/1,000 pcs (10x100 pcs)          €126.26               Add to Cart               AMBU® Blue Sensor™ N-00-S snap electrode, 25 pcs          €17.84               Add to Cart               Ambu® Blue Sensor™ P-00-S, bag/50 pcs          €19.68               Add to Cart               AMBU® Blue Sensor™ wired N-10-A electrodes, 25 pcs          €28.29               Add to Cart               Ambu® Neuroline 720 prewired electrode 100cm, 10pcs           €17.01               Add to Cart               AMBU® Neuroline™ 720 electrodes, 25 pcs          €15.99               Add to Cart               Ambu® Neuroline™ Ground Electrode, 1 pc          €2.41               Add to Cart               Ambu® Pediatric electrode, box/300 pcs (100 sets of 3 pcs)          €356.36               Add to Cart             Sort By  Product Name Price  Set Descending Direction         View as   Grid    List        9 Items            Show  16 32 80 Allper page    
    require([
        'jquery'        
    ], function ($) {
    
        var _second = 1000;
        var _minute = _second * 60;
        var _hour = _minute * 60;
        var _day = _hour * 24;
        var timer;

        
        var date = new Date('2020-05-20 11:43:17');
        var l_date = new Date();
        var offset_date = l_date - date;

        function showRemaining() 
        {        
            $(&quot;.sw-dailydeal-wrapper&quot;).each(function(){
                var unique_id = $(this).attr(&quot;data-unique-id&quot;);
                
                var cid='countdown_'+unique_id;
                var daysid='countdown_days_'+unique_id;
                var hoursid='countdown_hours_'+unique_id;
                var minutesid='countdown_minutes_'+unique_id;
                var secondsid='countdown_seconds_'+unique_id;

                var startdateid='fromdate_'+unique_id;
                var id='todate_'+unique_id;

                var enddate = new Date($('#'+id).val());
                var dealstartdate=new Date($('#'+startdateid).val());

                var currentdate=new Date();

                
                var distance = enddate - (currentdate - offset_date);

                $('.sw-dailydeal-wrapper').show();

                if (distance &lt; 0) {
                   
                    $('#expired_'+unique_id).html(&quot;&lt;span style='font-size:25px; color:#000;'>EXPIRED!&lt;span>&quot;);

                } else if(dealstartdate > currentdate) {
                   $('.countdowncontainer_'+unique_id).hide();
                   var msg=&quot;&lt;span style='font-size:15px; color:#000;'> Coming Soon..&lt;br>Deal Start at:&lt;br>&quot;+$('#'+startdateid).val()+&quot;&lt;span>&quot;;
                   $('#expired_'+unique_id).html(msg);
                } else {
                    var days = Math.floor(distance / _day);
                    var hours = Math.floor((distance % _day) / _hour);
                    var minutes = Math.floor((distance % _hour) / _minute);
                    var seconds = Math.floor((distance % _minute) / _second);

                    if(hours &lt; 10)
                        hours = &quot;0&quot; + hours;
                    if(minutes &lt; 10)
                        minutes = &quot;0&quot; + minutes;
                    if(seconds &lt; 10)
                        seconds = &quot;0&quot; + seconds;
                    $('.countdowncontainer_'+unique_id).show();
                    $('#'+daysid).html(days);
                    $('#'+hoursid).html(hours);
                    $('#'+minutesid).html(minutes);
                    $('#'+secondsid).html(seconds);
                }
            });
        }
        
        
        timer = setInterval(function() 
        {
            showRemaining();
        }, 1000); 
    });  </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;maincontent&quot;)/div[@class=&quot;columns&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//main[@id='maincontent']/div[3]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Catalog Advanced Search'])[2]/following::div[4]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Results'])[1]/following::div[5]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//main/div[3]</value>
   </webElementXpaths>
</WebElementEntity>
