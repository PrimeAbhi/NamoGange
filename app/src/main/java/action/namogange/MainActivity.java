package action.namogange;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import action.namogange.dummy.DummyContent;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, ItemFragment.OnListFragmentInteractionListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        if (savedInstanceState == null) {
            navigationView.setCheckedItem(R.id.about_ganga);
            setFragment(new AboutGanga(), "About Ganga");
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        String title = item.getTitle().toString();
        if (id == R.id.about_ganga) {
            setFragment(new AboutGanga(), title);
        } else if (id == R.id.places) {
            setFragment(new ItemFragment(), title);
        } else if (id == R.id.gallery) {

        } else if (id == R.id.notifications) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }
        item.setChecked(true);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void setFragment(final Fragment fragment, final String title) {
        setTitle(title);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.content_replace, fragment)
                .commit();

    }

    public void onListFragmentInteraction(DummyContent.DummyItem item, int position) {

        String[] str = {"Har Ki Pauri", "Mansa Devi Temple", "Bharat Mata Mandir", "Chandi Devi Temple",
                "Vaishno Devi Temple", "Daksha Temple", "Shantikunj", "Gau Ghat",
                "Kushavarta Ghat", "Vishnu Ghat", "Asthi Pravah Ghat", "Subhash Ghat", "GKV", "FET,GKV"};

        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("title", str[position]);
        switch (position) {
            case 0:
                intent.putExtra("url", "<html><body><img style=\"width:100%;\" src=\"file:///android_res/mipmap/har_ki_pauri.jpg\"/><p>Har Ki Pauri is a famous ghat on the banks of the Ganges in Haridwar in Uttarakhand state in India. This revered place is the major landmark of the holy city of Haridwar.<br/>Har Ki Pauri is also the area where thousands of pilgrims converge and the festivities commence during the Kumbha Mela, which takes place every twelve years, and the Ardh Kumbh Mela, which takes place every six years and the Punjabi festival of Vaisakhi, a harvest festival occurring every year in the month of April .</p><h3 style=\"text-align:center; color:#FF4081;\">The Ganga Aarti</h3><img style=\"width:100%;\" src=\"file:///android_res/mipmap/ganga_aarti.jpg\"/><p>Each evening at sunset priests perform Ganga Aarti here, when lights are set on the water to drift downstream. A large number of people gather on both the banks of river Ganges to sing its praises. The priests hold large fire bowls in their hands, the gongs in the temples at the Ghat start ringing and the chants flowing out of lips fill the air. People float earthen Diyas, with burning flickers and flowers in them as a symbol of hope and wishes .The golden hues of floral diyas reflected in the river Ganges presents spectacular view.</p><p style=\"color:#63F;\">Keep Ganga Clean.<br/>Take a pledge to protect your local water bodies and environment, and to inspire your friends, family and community to do the same.</p></body></html>");
                break;
            case 1:
                intent.putExtra("url", "<html><body><img style=\"width:100%;\" src=\"file:///android_res/mipmap/mansa_devi.jpg\"/><p>Mansa Devi Temple is an ancient temple that attracts people from both far and near due to its significance. The temple is considered a must visit for the pilgrims going to Haridwar. It enhances the holy tradition of Haridwar which persists in the place from many past centuries. It offers views of the River Ganges and the plains of Haridwar. To reach the shrine one has to either follow the trekking route up to this holy shrine or ride on the recently introduced rope-way service. The rope-way service known as \"Mansa Devi Udankhatola\" was introduced for the benefit of the pilgrims and it caters to the pilgrims also to the nearby located Chandi Devi shrine. The rope-way carries the pilgrims from the lower station directly to the Mansa Devi Temple. The total length of the rope-way is 540 metres (1,770 ft) and the height it covers is 178 metres (584 ft). On a normal day, the temple is open between 8 am and 5 pm, except for lunch closings of 12 pm to 2 pm.</p><br/><img style=\"width:100%;\" src=\"file:///android_res/mipmap/mansa_devi_ropeway.jpg\"/><p>This temple along with the nearby located Chandi Devi temple is visited by thousands of devotees from various parts of the country, and especially during the Navratra and the Kumbha Mela in Haridwar.<br/>It is said that goddesses Mansa and Chandi, the two forms of goddess Parvati always reside close to each other. This belief can also be found true in other case since near to the Mata Mansa Devi Mandir in Panchkula, Haryana, there is a Chandi Mandir located nearby in Chandigarh.</p><p style=\"color:#63F;\">Keep Ganga Clean.<br/>Take a pledge to protect your local water bodies and environment, and to inspire your friends, family and community to do the same.</p></body></html>");
                break;
            case 2:
                intent.putExtra("url", "<html><body><img style=\"width:100%;\" src=\"file:///android_res/mipmap/bharat_mata_mandir.jpg\"/><p>Bharat Mata Mandir, which is also known as Mother India Temple, is one of the most visited temples located in Haridwar. The temple is dedicated to Bharat Mata by her devoted patriotic nationals. This religious shrine was founded by Swami Satyamitranand Giri. In 1983, this temple was inaugurated by Late Prime Minister, Smt. Indira Gandhi. As the conception of Bharat Mata predates the Partition of India, she is intended to represent \"Aryavarta\", the motherland of Hinduism in Hindu Nationalism, not merely restricted to the secular Republic of India, and Bharat Mata remains a symbol of the \"vision of a unified motherland\" in Hindu nationalist thought. Bharat Mata temples exist in the Mahatma Gandhi Kashi University, inaugurated by Mahatma Gandhi in 1936 and another in Haridwar built in 1983 by Vishwa Hindu Parishad (VHP).</p><br/><p>Bharat Mata Mandir Detail:<br/><strong>First Floor :</strong> First floor is dedicated to Bharat Mata (Mother India) it has the statue of Bharat Mata.<br/><strong>Second Floor :</strong>The second floor ‘Shoor Mandir’ is dedicated to the well renowned heroes of India.<br/><strong>Third Floor :</strong>The third floor ‘Matru Mandir’ is dedicated to the achievements of India’s revered women such as Meera Bai, Savitri, Maitri etc. <br/><strong>Fourth Floor :</strong> The fourth floor the great saints from various religions, including Jainism, Sikhism and Buddhism are featured on ‘Sant Mandir’. It is the Sant Mandir and features great saints of the Jainism, Sikhism and Buddhism faith.<br/><strong>Fifth Floor :</strong> The Assembly Hall with walls depicting symbolic coexistence of all religions practiced in India and paintings portraying history and beauty in various provinces of India are situated on the fifth floor. <br/><strong>Sixth Floor :</strong> The various forms of the Goddess of Shakti can be seen on the sixth floor, it is dedicated to Goddess Shakti of the Hindu religion.<br/><strong>Seventh Floor :</strong> The seventh floor is devoted to all incarnations of Lord Vishnu the preserver form of the holy Hindu Trinity.<br/><strong>Eighth Floor :</strong> The uppermost floor features the shrine of Lord Shiva, the supreme god in Hindu tradition.</p><p style=\"color:#63F;\">Keep Ganga Clean.<br/>Take a pledge to protect your local water bodies and environment, and to inspire your friends, family and community to do the same.</p></body></html>");
                break;
            case 3:
                intent.putExtra("url", "<html><body><img style=\"width:100%;\" src=\"file:///android_res/mipmap/chandi_devi.jpg\"/><p>Chandi Devi Temple, Haridwar is a Hindu temple dedicated to Goddess Chandi Devi in the holy city of Haridwar in the Uttarakhand state of India. The temple is situated atop the Neel Parvat on the Eastern summit of the Sivalik Hills, the southernmost mountain chain of the Himalayas. Chandi Devi Temple was built in 1929 by Suchat Singh in his reign as the King of Kashmir. However, the main murti of Chandi Devi at the temple is said to have been installed in the 8th century by Adi Shankaracharya, one of the greatest priests of Hindu religion. The temple also known as Neel Parvat Teerth is one of the Panch Tirth (Five Pilgrimages) located within Haridwar.</p><br/><h3 style=\"text-align:center; color:#FF4081;\">Significance</h3><p>The temple is one of the most ancient temples of India. Thousands of devotees flock to the temple, especially during the festivals of Chandi Chaudas and Navratra and the Kumbha Mela in Haridwar, to seek the blessings of the goddesses who is believed to fulfill their wishes. The temple is a must visit for the pilgrims going to Haridwar.<br/>Very near to the Chandidevi temple, the temple of Anjana, mother of the monkey-god Hanuman is located and devotees visiting Chandi Devi temple also visit this temple. Neeleshwar Temple is also situated at the foot of the Neel Parvat. It is said[citation needed] that Mansa and Chandi, the two forms of goddess Parvati always reside close to each other. The temple of Mansa is exactly on the other side of the hilltop on the Bilwa Parvat on the opposite bank of River Ganges. This belief can also be found true in other case since near to Mata Mansa Devi Mandir in Panchkula, Haryana, there is a Chandi Mandir located nearby in Chandigarh.</p><p style=\"color:#63F;\">Keep Ganga Clean.<br/>Take a pledge to protect your local water bodies and environment, and to inspire your friends, family and community to do the same.</p></body></html>");
                break;
            case 4:
                intent.putExtra("url", "<html><body><img style=\"width:100%;\" src=\"file:///android_res/mipmap/vaishno_devi.jpg\"/><p>The Vaishno Devi Temple lies on the way to the Eight-Storey Bharat Mata Temple a few kilometres outside Haridwar.The Temple is dedicated to Mata Vaishno Devi, and is modelled after the famous temple of the same name in Jammu & Kashmir.<br/>Devotees visited this temple throughout the year. This temple is dedicated to Goddess Vaishno Devi. The leading path of this temple is similar to the temple in Jammu. The path is full of tunnels and caves.Some people believed that the Goddess blesses only those who truly have the intention to implore her blessings from the bottom of their hearts</p><br/><h3 style=\"text-align:center; color:#FF4081;\">History</h3><p>It is very difficult, like any other old shrines, to trace back the history of Vaishno Devi; however geological studies indicate that the holy shrine of Vaishno Devi is almost a million years old. Though the Vedic literature doesn’t refer to any goddess, however one can find the mention of Trikuta hills in Rigveda - the oldest of the four Vedas. <br/>There are different versions of the origin of Vaishno Devi available, but according to the most popular version, the shrine of Vaishno Devi was discovered about 700 years back by Pandit Shridhar. According to the popular belief, Mata once helped in organizing a Bhandaara at Shridhar’s place. But, she had to leave the place to escape Bhairon Nath. As Mata left the place, Shridhar started giving up food in grief and started praying for Mata Vaishno Devi.</p><p style=\"color:#63F;\">Keep Ganga Clean.<br/>Take a pledge to protect your local water bodies and environment, and to inspire your friends, family and community to do the same.</p></body></html>");
                break;
            case 5:
                intent.putExtra("url", "<html><body><img style=\"width:100%;\" src=\"file:///android_res/mipmap/daksha_mandir.jpg\"/><p>Daksheswara Mahadev or Daksha Mahadev temple is a Hindu temple dedicated to Lord Shiva, located in the town of Kankhal, about 4 km from Haridwar, Uttarakhand, India. It is named after King Daksha Prajapati, the father of Sati. Daksha is one of the fourteen Prajapatis, creator deities, who preside over procreation and are the protector of life in Hindu mythology.<br/>The present temple was built by Queen Dhankaur in 1810 and rebuilt in 1962. It is a place of pilgrimage for Shaivaite devotees on Maha Shivaratr</p><br/><h3 style=\"text-align:center; color:#FF4081;\">The legend of Daksha</h3><p>As mentioned in the Mahabharata and other texts of Hinduism, King Daksha Prajapati, the father of Sati, Shiva's first wife, performed Yagna at the place where the temple is situated. Although Sati felt insulted when her father did not invited Shiva to the ritual, she attended the yagna. She found that Shiva was being spurned by her father and she burnt herself in the Yajna Kunda itself. Shiva got angry and sent his Ganas, the terrible demi-god Virabhadra and Bhadrakali to the ritual. On the direction of Shiva, Virabhadra appeared with Shiva's ganas in the midst of Daksha's assembly like a storm wind and waged a fierce war with the gods and mortals present culminating in the beheading of Daksha, who was later given the head of a goat at the behest of Brahma and other gods. Much of the details of the Ashvamedha Yagna (Horse Sacrifice) of Daksha are found in the Vayu Purana.</p><p style=\"color:#63F;\">Keep Ganga Clean.<br/>Take a pledge to protect your local water bodies and environment, and to inspire your friends, family and community to do the same.</p></body></html>");
                break;
            case 6:
                intent.putExtra("url", "<html><body><img style=\"width:100%;\" src=\"file:///android_res/mipmap/shanti_kunj.jpg\"/><p>Shantikunj is the headquarters of the spiritual and social organisation All World Gayatri Pariwar (AWGP). Established in 1971 at Haridwar, it has emerged over the years as a center of the global movement of Yug Nirman Yojana (Movement for the Reconstruction of the Era) for moral-spiritual regeneration in the light of hoary Indian heritage. Situated at the bank of holy Ganges and between the Shivalik ranges of the Himalayas, its also a place of attraction for tourists and seekers of spiritual guidance.</p><br/><h3 style=\"text-align:center; color:#FF4081;\">Aim</h3><p>Shantikunj is devoted to cultural, ethical, moral and spiritual awakening and national integration. Development of divinity in mankind is the foremost goal and avowed objective. Pledged for national peace, prosperity, amity, love, goodwill and fraternity irrespective of region, religion, faith, caste, creed, sect etc., Shantikunj is a unique abode true to its name. Visitors of all faiths & linkages visit the Ashram (Spiritual Center).<br/>Expansion of national unity, amity and brotherhood and extinction of ignorance, jealousy, hatred, and strife from globe are being attempted by popularizing Gayatri Mantra, Yagya and Sanskaars (sacramental rites), the adoption of which invokes celestial thoughts and inspires for divine deeds. The divinity may be seen firmly fixed in every activity of this holy pilgrimage center.</p><h3 style=\"text-align:center; color:#FF4081;\">Training camps</h3><p>For upliftment of the moral, cultural, spiritual and ethical values, national integration and development of youths, various trainings are organized frequently. Amongst these, the regular ones are:<br/>1. Nine days training of Sanjeewani Vidyaa (Art of Living & Art of Relating training camps)One month training of Yug Shilpi and Parivraajak (Art of Serving & Art of Leading training camps)<br/>2. Three months training for proficiency in Sangeet (music).<br/>3. Occasional trainings of officers, and employees of Govt., local bodies, Corporations, Banks, factories etc. are also organized on: elegant life style, organizational management, efficient working methodology, work culture, glory of labor, health, behavioral science, value of time, inculcation of discipline, duty consciousness, national integration.<br/>4. For the all round development of villages and self-employment generation, 9 days training is also imparted to selected village folk. Training relates to: agriculture, horticulture, herbal production, Dairy and Cottage industries.<br/>5. All these trainings aim at the all round development of the nation & integration of the country by inducing noble sentiments in the minds of individuals by adoption of scientific ways of spirituality, which can provide a remedy for all the ills afflicting the nation.</p><p style=\"color:#63F;\">Keep Ganga Clean.<br/>Take a pledge to protect your local water bodies and environment, and to inspire your friends, family and community to do the same.</p></body></html>");
                break;
            case 7:
                intent.putExtra("url", "<html><body><img style=\"width:100%;\" src=\"file:///android_res/mipmap/gau_ghat.jpg\"/><p>The Gau Ghat is situated on the southern part of the Subhash Ghat. Mythologically, the cow is known as \"Kamadhenu\". That fulfills the wishes of the desires. The people reach at this site to grant forgiveness for the sin of cow killing for foods. These formal events were celebrated with the holy act of a donation of a cow. The act of killing of a cow is similar, of killing to a Brahmin. On any religious occasion people crowds the Gau Ghat for prayer. There is a fact that the ashes of Indira Gandhi, Jawaharlal Nehru and Mahatma Gandhi were blew at this ghat.</p><br/><p style=\"color:#63F;\">Keep Ganga Clean.<br/>Take a pledge to protect your local water bodies and environment, and to inspire your friends, family and community to do the same.</p></body></html>");
                break;
            case 8:
                intent.putExtra("url", "<html><body><img style=\"width:100%;\" src=\"file:///android_res/mipmap/kush_ghat.jpg\"/><p>Kushavarta Ghat, located at a distance of 0.5 km from Har Ki Pauri, was constructed by a Maratha queen Ahilyabai Holkar. It is one of the ideal religious destinations for devotees who wish to perform Shraddha rites for the departed souls.<br/><br/>According to a popular belief, it is said that this ghat is related to Dattatreya, who was a great saint of the ancient period. It is believed that he had made a visit to this ghat several times and also mediated on this ghat. According to the chronicles of history, it is stated that it is this ghat where Dattatreya offered his penance by standing on one foot for thousand years.</p><br/><p style=\"color:#63F;\">Keep Ganga Clean.<br/>Take a pledge to protect your local water bodies and environment, and to inspire your friends, family and community to do the same.</p></body></html>");
                break;
            case 9:
                intent.putExtra("url", "<html><body><img style=\"width:100%;\" src=\"file:///android_res/mipmap/vishnu_ghat.jpg\"/><p>Vishnu Ghat, named after Lord Vishnu, is one of the most visited ghats located in Haridwar. Believed to be the same place where Lord Vishnu bathed, it is said that a dip in the holy water of this ghat, washes away all the sins. Owing to the immense faith in Lord Vishnu by the people of Haridwar, devotees as well as tourists visit this land to take a dip in the ghat.</p><br/><p style=\"color:#63F;\">Keep Ganga Clean.<br/>Take a pledge to protect your local water bodies and environment, and to inspire your friends, family and community to do the same.</p></body></html>");
                break;
            case 10:
                intent.putExtra("url", "<html><body><img style=\"width:100%;\" src=\"file:///android_res/mipmap/ashthi_pravah.jpg\"/><p>The Asthi Parvath Ghat is located in the south of the Ganga temple. Peoples float the ashes of the dead persons in the sacred water of Ganga at this Ghat. They believe that as the 60000 thousand sons of Sagara got salvation in the cool water of Ganga. People first do the prayer and then they blow the ashes of their kin in the river. When the cannel is closed the beggars started finding the coins and gold which is blown in the river with the ashes.</p><br/><p style=\"color:#63F;\">Keep Ganga Clean.<br/>Take a pledge to protect your local water bodies and environment, and to inspire your friends, family and community to do the same.</p></body></html>");
                break;
            case 11:
                intent.putExtra("url", "<html><body><img style=\"width:100%;\" src=\"file:///android_res/mipmap/subhash_ghat.jpg\"/><p>The Subhash Ghat is close to the Harki Pauri Ghat with a statue of Netaji Subhash Chandra Bose, one of the great freedom fighter of India. There is a voluntarily organized Sewa Samiti which provides helps to the pilgrims as a dispensary.</p><br/><p style=\"color:#63F;\">Keep Ganga Clean.<br/>Take a pledge to protect your local water bodies and environment, and to inspire your friends, family and community to do the same.</p></body></html>");
                break;
        }
        startActivity(intent);

    }

}
