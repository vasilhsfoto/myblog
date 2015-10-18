USE blog;

INSERT INTO tag(id,tag_name) values(1, 'Java');
INSERT INTO tag(id,tag_name) values(2, 'Oracle');
INSERT INTO tag(id,tag_name) values(3, 'Data Structure');
INSERT INTO tag(id,tag_name) values(4, 'Multi-threaded');
INSERT INTO tag(id,tag_name) values(5, 'Data Bases');
INSERT INTO tag(id,tag_name) values(6, 'SQL');

INSERT INTO article(id,article_html,article_markup,title,picture,num_of_comments,author)
       values (1, '<article>
						<h2> <a href="skata.html"> Java concurrency demestyfied 10/08/2012 </a> </h2> 
					
						<div class="row">
							<div class="group1 col-md-6">
								<span class="glyphicon glyphicon-folder-open "> </span> <a href="#">Java </a>
								<span class="glyphicon glyphicon-user"> </span> <a href="#">vassilis</a>
							</div>

							<div class="group2 col-md-6">
								<span class="glyphicon glyphicon-pencil"> </span> <a href="singlepost.html#comments">${NUM_OF_COMMENTS} Comments</a>
								<span class="glyphicon glyphicon-time"> </span> <a href="#">20 Aug 2015</a>
							</div>
						</div>
						
						<hr/>
						
						<img src="http://placehold.it/450x300" class="img-responsive img-rounded">
						<br/>		
						
						<p class="lead">Aries is the first sign of the zodiac, and that is pretty much how those born under this sign see 100 themselves: first. Aries are the leaders of the pack, first in line to get things going. Whether or not everything gets done is another question altogether, for an Aries prefers to initiate rather than to complete. Do you have a project needing a kick-start? Call an Aries, by all means. The leadership displayed by Aries is most impressive, so do not be surprised if they can rally the troops against seemingly insurmountable odds.</p>
 
    					<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ullam iste voluptatibus in quisquam voluptate quo, nostrum aliquid mollitia asperiores architecto, tempore cupiditate quae vel facilis blanditiis autem voluptatem, minus itaque harum quibusdam. Quos iste dolorum ipsum fugit autem? Quo veniam ab repellat quam aliquam magni mollitia eum nihil corrupti quia natus eligendi, unde delectus animi voluptatibus, iure fugit obcaecati. Neque qui voluptatum aperiam eligendi, accusamus ratione ducimus, excepturi ad cupiditate veritatis reiciendis ipsum asperiores molestiae delectus suscipit ullam, incidunt eum error commodi expedita vero deserunt? Ut optio ipsam aut fugiat, enim magni tenetur minus quod voluptate ea cum debitis blanditiis, unde quo officia vero qui atque consequatur nobis incidunt tempora odit ex nam. Aliquam ipsa dolor earum alias odit, esse doloremque veritatis sunt tempore natus quis impedit suscipit dolorem veniam facere quod consequatur, quas commodi mollitia a officia ipsum. Vel provident culpa ullam dignissimos molestias nemo aspernatur maiores ducimus totam, id voluptatem delectus at deleniti mollitia quibusdam magnam praesentium nostrum, cum autem eveniet, minus, ea nulla perferendis libero harum. Cum est quam earum non commodi quia. Sit laudantium aliquam excepturi, eaque in omnis nobis debitis magnam voluptatum! Quod aliquid, explicabo facere, repudiandae maiores amet possimus, quis et adipisci atque cum?
    					</p>
 
    					<p class="pull-right">
					    	<a href="singlepost.html"> continue reading...</a>
    					</p>
						<br/>
						<hr/>
					 </article>
', 
null, 'Java concurrency demestyfied', 'img/450x300.gif', 2, 'Vassilis');


INSERT INTO article(id,article_html,article_markup,title,picture,num_of_comments,author)
       values (2, '					 <article>
						<h2> <a href="skata.html"> Web development servlet demestyfied 10/08/2012 </a> </h2> 
					
						<div class="row">
							<div class="group1 col-md-6">
								<span class="glyphicon glyphicon-folder-open "> </span> <a href="#">Java </a>
								<span class="glyphicon glyphicon-user"> </span> <a href="#">vassilis</a>
							</div>

							<div class="group2 col-md-6">
								<span class="glyphicon glyphicon-pencil"> </span> <a href="singlepost.html#comments">${NUM_OF_COMMENTS} Comments</a>
								<span class="glyphicon glyphicon-time"> </span> <a href="#">20 Aug 2015</a>
							</div>
						</div>
						
						<hr/>
						
						<img src="http://placehold.it/450x300" class="img-responsive img-rounded">
						<br/>		
						
						<p class="lead">Aries is the first sign of the zodiac, and that''s pretty much how those born under this sign see themselves: first. Aries are the leaders of the pack, first in line to get things going. Whether or not everything gets done is another question altogether, for an Aries prefers to initiate rather than to complete. Do you have a project needing a kick-start? Call an Aries, by all means. The leadership displayed by Aries is most impressive, so don''t be surprised if they can rally the troops against seemingly insurmountable odds.</p>
 
    					<p>The symbol of Aries is the Ram, and that''s both good and bad news. Impulsive Aries might be tempted to ram their ideas down everyone''s throats without even bothering to ask if they want to know. It''s these times when you may wish Aries'' symbol were a more subdued creature, more lamb than ram perhaps. You''re not likely to convince the Ram to soften up; these folks are blunt and to the point. Along with those qualities comes the sheer force of the Aries nature, a force that can actually accomplish a great deal. Much of Aries'' drive to compete and to win comes from its Cardinal Quality. Cardinal Signs love to get things going, and Aries exemplifies this even better than Cancer, Libra or Capricorn.</p>
 
    					<p class="pull-right">
					    	<a href="singlepost.html"> continue reading...</a>
    					</p>

						<br/>

						<hr/>
					</article>
', null, 'Web development servlet demestyfied', 'img/450x300.gif', 0, 'Vassilis');


INSERT INTO article_tag(article_id, tag_id) values(1, 1);
INSERT INTO article_tag(article_id, tag_id) values(1, 2);
INSERT INTO article_tag(article_id, tag_id) values(1, 3);
INSERT INTO article_tag(article_id, tag_id) values(1, 5);
INSERT INTO article_tag(article_id, tag_id) values(2, 2);
INSERT INTO article_tag(article_id, tag_id) values(2, 3);
INSERT INTO article_tag(article_id, tag_id) values(2, 4);
INSERT INTO article_tag(article_id, tag_id) values(2, 6);
